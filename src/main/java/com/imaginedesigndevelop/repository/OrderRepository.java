package com.imaginedesigndevelop.repository;

import com.imaginedesigndevelop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query(value = "SELECT s.name, COUNT(o.satisfaction_id) " +
        "FROM orders o " +
        "LEFT JOIN satisfaction s on s.id = o.satisfaction_id " +
        "WHERE o.business_id = ?1 " +
        "GROUP BY o.satisfaction_id " +
        "HAVING COUNT(*) > 0", nativeQuery = true)
    List getBusinessSatisfactionCounts(Integer id);

    @Query(value = "SELECT r.name, COUNT(u.race_id) " +
        "FROM `orders` o " +
        "LEFT JOIN user u on u.id = o.user_id " +
        "LEFT JOIN race r on r.id = u.race_id " +
        "WHERE o.business_id = ?1 " +
        "GROUP BY r.name, u.race_id " +
        "HAVING COUNT(*) > 0", nativeQuery = true)
    List getBusinessCultureCounts(Integer id);

    @Query(value = "SELECT g.name, COUNT(u.gender_id) " +
        "FROM `orders` o " +
        "LEFT JOIN user u on u.id = o.user_id " +
        "LEFT JOIN gender g on g.id = u.gender_id " +
        "WHERE o.business_id = ?1 " +
        "GROUP BY g.name, u.gender_id " +
        "HAVING COUNT(*) > 0", nativeQuery = true)
    List getBusinessGenderCounts(Integer id);

    @Query(value = "SELECT dob " +
        "FROM `orders` o " +
        "LEFT JOIN user u on u.id = o.user_id " +
        "WHERE o.business_id = ?1", nativeQuery = true)
    List getUsersDob(Integer id);

    @Query(
        value = "SELECT WEEKDAY(o.order_timestamp) as order_day_of_week, " +
            "COUNT(o.user_id) " +
            "FROM `orders` o " +
            "WHERE o.business_id = ?1 " +
            "GROUP BY order_day_of_week " +
            "HAVING COUNT(*) > 0", nativeQuery = true)
    List getBusinessBusyness(Integer id);
}


package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    void save(Role role);

    Optional<Role> findById(Integer id);

    List<Role> findAll();

    void delete(Integer id);

    Role getOne(int id);
}

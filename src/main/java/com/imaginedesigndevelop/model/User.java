package com.imaginedesigndevelop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "emaiL", length = 100, nullable = true)
    private String email;
    @Column(name = "user_name", length = 100, nullable = true)
    private String userName;
    @Column(name = "first_name", length = 45, nullable = true)
    private String firstName;
    @Column(name = "business_name", length = 45, nullable = true)
    private String businessName;
    @Column(name = "last_name", length = 45, nullable = true)
    private String lastName;
    @Column(name = "address", length = 100, nullable = true)
    private String address;
    @Column(name = "city", length = 45, nullable = true)
    private String city;
    @Column(name = "state", length = 45, nullable = true)
    private String state;
    @Column(name = "country", length = 45, nullable = true)
    private String country;
    @Column(name = "zip_code", length = 45, nullable = true)
    private String zip;
    @Column(name = "latitude", length = 45, nullable = true)
    private String latitude;
    @Column(name = "lONGitude", length = 45, nullable = true)
    private String Longitude;
    @Column(name = "phone_number", length = 45, nullable = true)
    private String phoneNumber;
    @Column(name = "date_registered", nullable = true)
    private Long dateRegistered;
    @Column(name = "dob", nullable = true)
    private Long dob;
    @Column(name = "password", nullable = true)
    private String password;
    @Transient
    private String passwordConfirm;
    @Column(name = "reset_token", nullable = true)
    private String resetToken;
    @Column(name = "account_type", nullable = true)
    private String accountType;
    @Column(name = "stripe_customer_has_payment_info", nullable = true)
    private String stripeCustomerHasPaymentInfo;
    @Column(name = "stripe_customer_id", nullable = true)
    private String stripeCustomerId;
    @Column(name = "stripe_customer_subscription_id", nullable = true)
    private String stripeCustomerSubscriptionID;
    @Column(name = "stripe_customer_subscription_amount", nullable = true)
    private Long stripeCustomerSubscriptionAmount;
    @Column(name = "stripe_customer_registration", nullable = true)
    private Long stripeCustomerRegistration;
    @Column(name = "stripe_customer_cancelled", nullable = true)
    private Long stripeCustomerCancelled;
    @Column(name = "stripe_customer_current_period_end", nullable = true)
    private Long stripeCustomerCurrentPeriodEnd;
    @Column(name = "stripe_customer_card", nullable = true)
    private String stripeCustomerCard;
    @Column(name = "stripe_customer_card_month", nullable = true)
    private Long stripeCustomerCardMonth;
    @Column(name = "stripe_customer_card_year", nullable = true)
    private Long stripeCustomerYear;

    @ManyToMany
    private Set<Role> roles;

    @ManyToOne
    @JoinColumn(name = "race_id", nullable = true)
    private Race race;

    @ManyToOne
    @JoinColumn(name = "gender_id", nullable = true)
    private Gender gender;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Order> orders;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Business> business;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Long getDob() {
        return dob;
    }

    public void setDob(Long dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Race getRace() {
        return race;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Business> getBusiness() {
        return business;
    }

    public void setBusiness(Set<Business> business) {
        this.business = business;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStripeCustomerId() {
        return stripeCustomerId;
    }

    public void setStripeCustomerId(String stripeCustomerId) {
        this.stripeCustomerId = stripeCustomerId;
    }

    public Long getStripeCustomerRegistration() {
        return stripeCustomerRegistration;
    }

    public void setStripeCustomerRegistration(Long stripeCustomerRegistration) {
        this.stripeCustomerRegistration = stripeCustomerRegistration;
    }

    public Long getStripeCustomerCancelled() {
        return stripeCustomerCancelled;
    }

    public void setStripeCustomerCancelled(Long stripeCustomerCancelled) {
        this.stripeCustomerCancelled = stripeCustomerCancelled;
    }

    public Long getStripeCustomerCurrentPeriodEnd() {
        return stripeCustomerCurrentPeriodEnd;
    }

    public void setStripeCustomerCurrentPeriodEnd(
        Long stripeCustomerCurrentPeriodEnd) {
        this.stripeCustomerCurrentPeriodEnd = stripeCustomerCurrentPeriodEnd;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStripeCustomerHasPaymentInfo() {
        return stripeCustomerHasPaymentInfo;
    }

    public void setStripeCustomerHasPaymentInfo(
        String stripeCustomerHasPaymentInfo) {
        this.stripeCustomerHasPaymentInfo = stripeCustomerHasPaymentInfo;
    }

    public String getStripeCustomerSubscriptionID() {
        return stripeCustomerSubscriptionID;
    }

    public void setStripeCustomerSubscriptionID(
        String stripeCustomerSubscriptionID) {
        this.stripeCustomerSubscriptionID = stripeCustomerSubscriptionID;
    }

    public Long getStripeCustomerSubscriptionAmount() {
        return stripeCustomerSubscriptionAmount;
    }

    public void setStripeCustomerSubscriptionAmount(
        Long stripeCustomerSubscriptionAmount) {
        this.stripeCustomerSubscriptionAmount =
            stripeCustomerSubscriptionAmount;
    }

    public String getStripeCustomerCard() {
        return stripeCustomerCard;
    }

    public void setStripeCustomerCard(String stripeCustomerCard) {
        this.stripeCustomerCard = stripeCustomerCard;
    }

    public Long getStripeCustomerCardMonth() {
        return stripeCustomerCardMonth;
    }

    public void setStripeCustomerCardMonth(Long stripeCustomerCardMonth) {
        this.stripeCustomerCardMonth = stripeCustomerCardMonth;
    }

    public Long getStripeCustomerYear() {
        return stripeCustomerYear;
    }

    public void setStripeCustomerYear(Long stripeCustomerYear) {
        this.stripeCustomerYear = stripeCustomerYear;
    }
}

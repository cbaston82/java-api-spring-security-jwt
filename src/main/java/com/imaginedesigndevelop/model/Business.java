package com.imaginedesigndevelop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "business")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name", length = 45, nullable = true)
    private String firstName;
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
    @Column(name = "longitude", length = 45, nullable = true)
    private String longitude;
    @Column(name = "phone_number", length = 45, nullable = true)
    private String phoneNumber;
    @Column(name = "date_registered", nullable = false)
    private Long dateRegistered;
    @Column(name = "instagram_link", length = 200)
    private String instagramLink;
    @Column(name = "facebook_link", length = 200)
    private String facebookLink;
    @Column(name = "yelp_link", length = 200)
    private String yelpLink;
    @Column(name = "google_link", length = 200)
    private String googleLink;
    @Column(name = "clover_link", length = 200)
    private String cloverLink;
    @Column(name = "square_link", length = 200)
    private String squareLink;
    @Column(name = "business_name", length = 100)
    private String businessName;
    @Column(name = "business_slogan", length = 100)
    private String businessSlogan;
    @Column(name = "website_link", length = 100)
    private String websiteLink;
    @Column(name = "business_description")
    private String businessDescription;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
    private Set<Order> orders;

    protected Business() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    public String getYelpLink() {
        return yelpLink;
    }

    public void setYelpLink(String yelpLink) {
        this.yelpLink = yelpLink;
    }

    public String getGoogleLink() {
        return googleLink;
    }

    public void setGoogleLink(String googleLink) {
        this.googleLink = googleLink;
    }

    public String getCloverLink() {
        return cloverLink;
    }

    public void setCloverLink(String cloverLink) {
        this.cloverLink = cloverLink;
    }

    public String getSquareLink() {
        return squareLink;
    }

    public void setSquareLink(String squareLink) {
        this.squareLink = squareLink;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessSlogan() {
        return businessSlogan;
    }

    public void setBusinessSlogan(String businessSlogan) {
        this.businessSlogan = businessSlogan;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }
}

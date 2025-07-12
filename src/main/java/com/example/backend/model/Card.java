package com.example.backend.model;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String title;
    private String email;
    private String phone;
    private String website;
    private String company;

    @Column(length = 100000)
    private String image; // base64 encoded image

    // Getters and setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getWebsite() { return website; }

    public void setWebsite(String website) { this.website = website; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }
}

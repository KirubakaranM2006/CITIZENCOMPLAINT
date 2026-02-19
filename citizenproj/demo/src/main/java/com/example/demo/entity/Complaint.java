package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String category;
    private String status;
    private String imagePath;
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters & Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getImagePath() { return imagePath; }

    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public LocalDateTime getCreatedDate() { return createdDate; }

    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}

package com.example.userservice;

public class Bucket {
    private String id;
    private String title;
    private String description;
    private int personalNumber;
    private String imageLink;

    public Bucket(String id, String title, String description, int personalNumber, String imageLink) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.personalNumber = personalNumber;
        this.imageLink = imageLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}



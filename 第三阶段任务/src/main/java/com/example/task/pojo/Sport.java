package com.example.task.pojo;


import org.springframework.stereotype.Repository;


public class Sport {
    private Integer id;
    private String name;
    private String major;
    private String description;

    public Sport(Integer id, String name, String major, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.example.json.pojo;

import lombok.Data;

@Data
public class Competition {
    private Integer id;
    private String name;
    private String major;
    private String description;

    public Competition(Integer id, String name, String major ,String description) {
        this.id=id;
        this.name=name;
        this.major=major;
        this.description=description;
    }
}

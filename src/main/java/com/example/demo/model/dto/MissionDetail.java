package com.example.demo.model.dto;


import lombok.Data;

@Data
public class MissionDetail {
    private String missionId;
    private String dag;
    private String topology;
    private Boolean isDelete;
}
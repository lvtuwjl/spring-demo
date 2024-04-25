package com.example.demo.model.dto;


import lombok.Data;

@Data
public class MissionPublic {
    private String jobId;
    private String processType;
    private String status;
    private Integer maxExecutedTimes;
    private Integer currentExecutedTimes;
}

package com.example.demo.model;

import lombok.Data;

@Data
public class Mission {
    private String missionId;
    private String dag;
    private String topology;
    private Boolean isDelete;
}

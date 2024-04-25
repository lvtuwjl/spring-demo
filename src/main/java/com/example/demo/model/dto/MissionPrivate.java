package com.example.demo.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class MissionPrivate {
    private String sql;
    private List<String> taskList;
    private List<String> serviceList;
    private List<String> resultReceiverList;
}

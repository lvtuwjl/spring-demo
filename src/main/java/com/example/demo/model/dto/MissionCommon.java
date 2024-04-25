package com.example.demo.model.dto;

import lombok.Data;
import java.util.HashMap;
import java.util.List;

@Data
public class MissionCommon {
    private Boolean isEncrypted;
    private String cipherData;
    private String algo;
    private HashMap<String,String> algoExtraParamsMap;
    private List<String> kekList;
    private List<String> pkList;
    private List<String> partyIdList;
}

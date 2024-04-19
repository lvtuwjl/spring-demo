package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapper.MissionMapper;
import com.example.demo.model.Mission;
import com.example.demo.service.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class MissionServiceImpl implements MissionService {
//    private static final String MN = "mn";
    private String block;

    @Autowired
    MissionMapper missionMapper;

    @Override
    public void createMission(String name, int age) {
        log.warn("name: {}, block: {}, MissionServiceImpl createMission finished..",name,this.block);
        if (this.block==null){
            log.info("hahah");
        }

        this.block = name;
        Mission mission = missionMapper.getMission("id44", true);
        log.warn("mission: {}",mission);

        String missionStr = JSON.toJSONString(mission);
        log.info("missionStr: {}",missionStr);

        Object missionJson = JSON.toJSON(mission);
        log.info("missionJson: {}",missionJson);

        Mission mission1 = JSON.parseObject(missionStr, Mission.class);
        log.info("mission1: {}",mission1);

        List<Mission> missionArray = JSON.parseArray(missionStr, Mission.class);
        log.info("missionArray: {}",missionArray);

        List<Mission> missionList;
        missionList = new ArrayList<>();

//        List<Mission> missionList = new ArrayList<>();
        missionList.add(mission1);

//        Mission mission2 = missionMapper.getMission("id33", false);
        missionList.add(mission1);

        String missionListStr = JSON.toJSONString(missionList);
        log.info("missionListStr: {}",missionListStr);

        List<Mission> missionListArray = JSON.parseArray(missionListStr, Mission.class);
        log.info("missionListArray: {}",missionListArray);

        mission1.setMissionId("id66");
        int result = missionMapper.insertMission(mission1);
        log.info("result: {}",result);
    }

    @Override
    public int getAge(String name) {
        return 9;
    }
}

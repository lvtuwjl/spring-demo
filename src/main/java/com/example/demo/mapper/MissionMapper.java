package com.example.demo.mapper;

import com.example.demo.model.Mission;
import org.apache.ibatis.annotations.Param;

public interface MissionMapper {
    Mission getMission(@Param("missionId") String missionId, @Param("isDelete") boolean isDelete);
    int insertMission(Mission mission);
}

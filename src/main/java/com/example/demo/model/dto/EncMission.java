package com.example.demo.model.dto;

import lombok.Data;

@Data
public class EncMission {
    private MissionPublic missionPublic;
    private MissionPrivate MissionPrivate;
    private MissionCommon missionCommon;
}


// 修改合约，上链和查询链 数据结构变更
// 调用grpc接口 查询链数据，调用kms解密 返回前端
// 调用kms加密后，调用grpc接口 进行上链操作

// 查询资产 查询本地数据库
// 创建任务&审批任务：里面包含逻辑（各种任务类别）
// 任务调度&执行

// 设计数据库表结构 订阅入库使用 资产、任务、任务审批、任务调度 四大部分
//
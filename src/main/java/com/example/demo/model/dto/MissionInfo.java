package com.example.demo.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class MissionInfo {
    private String missionId;
    private String missionName;
    private Integer state; // 可以把任务审批状态维护在最外层，不进行加密操作
//    private Boolean isDelete;
    private Boolean isEncrypted; // 是否加密 false: 未加密 true: 加密
//    private String consortiumId; // 联盟ID
    private String data; // 未加密任务直接序列化，加密任务是先序列化再加密，反序列化时需要先解密再反序列化

    // 检查任务信息是否加密
    boolean checkEncrypted() {
        // if _, ok := m[""]; ok {
        //     fmt.Println("pubKey1 exists")
        // }
        // 再查询missionList之前 先判断下pubKey是否在 m中，如果在 则有权限查询encrypt数据，
        // 否则只能查询未加密数据

        return isEncrypted!=null&&isEncrypted;
    }

    // 加密任务信息
    void encrypt(MissionDetail missionDetail) {
        // TODO! implement service logic
    }

    // 解密任务信息
    MissionDetail decrypt() {
        MissionDetail missionDetail = new MissionDetail();
        missionDetail.setIsDelete(false);
        return missionDetail;
    }

    List<MissionDetail> queryContract() {
        return null;
    }

    void invokeContract(MissionDetail missionDetail) {
         // TODO!
    }

    // 合约查询根据是否加密来判断
    // 普通用户 直接使用isEncrypted == false 查询
    // 高级用户 查询全量数据，在java-backend-service 服务端进行解密操作
    // 新增任务的话 在java-backend-service 服务端进行加密操作
    // 加解密操作调用mira-kms 完成

    // TODO! 有一点是密钥存放在哪儿，如何判定，用户公钥是否需要上链

//    map[string]struct{}{
//        "pubKey1":struct{}{},
//        "pubKey2":struct{}{},
//        "pubKey3":struct{}{},
//    }
    //
}



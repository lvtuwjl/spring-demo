package com.example.demo.api;


import com.example.demo.common.errors.BizException;
import com.example.demo.service.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mission")
@Slf4j
public class MissionController {
    @Autowired
    private MissionService service;

    @GetMapping("/create")
    public void createMission(@RequestParam(value = "name") String name) throws Exception{
        log.warn("MissionController createMission finished..");
        service.createMission(name, 25);
        throw new BizException(503, "test throw err");
    }
}

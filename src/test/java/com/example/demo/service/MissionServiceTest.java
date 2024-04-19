package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.Mission;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class MissionServiceTest {
    @Mock
    private Mission mission;


    @BeforeAll
    public static void beforeClass() {
        System.out.println("in before class");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("in after class");
    }

    @BeforeEach
    public void before() {
        MockitoAnnotations.initMocks(this); // 此方法已被deprecad
        System.out.println("in before");
    }

    @AfterEach
    public void after() {
        System.out.println("in after");
    }

//    @Test
//    public void firstTest() {
//        assertEquals(2, 1 + 1);
//        log.info("name: {}",name);
//    }

//    @Ignore
    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        log.info("in test case 2, {}",mission);
    }
}
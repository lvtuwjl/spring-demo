package com.example.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@MapperScan("com.example.demo.mapper")
@SpringBootApplication(scanBasePackages = {"com.example.demo"})
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        log.info("root");
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("hello");
        return String.format("Hello %s!", name);
    }

    @PostMapping("/ph")
    public String ph(@RequestParam(value = "name1", defaultValue = "World1") String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        System.out.println("Hello World");

//        Student stu = new Student("zs",23);
//        String name = stu.getName();
//        log.info("name: {}", name);
//        stu.setName("ls");
//        new Det().set(stu);
//        new Det().de2();
//         name = stu.getName();
//        log.info("name: {}", name);

//        Det det = new Det();
//        log.info("det: {}, {}",det.getName(),det.getData());
//        det.setName("dan");
//        List<String> list = new ArrayList<>();
//        list.add("jl");
//        list.add(det.getName());
//        list.add("lyf");
//        det.setData(list);
//        log.warn("det: {}, {}",det.getName(),det.getData());

    }
}

@Data
class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Det{
    private  String name;
    private List<String> data;

    void set(Student stu){
        stu.setName("Ha");
    }

    void g1(){
        this.data.add("jk");
    }

    String de1() {
        System.out.println("de1");
        return "Hey1";
    }

    String de2() {
        System.out.println("de2");
        String d1 = this.de1();
        System.out.println("de2 "+d1);
        return "Hey2";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
       this.name = name;
    }

    List<String> getData() {
        return data;
    }
    void setData(List<String> data) {
        this.data = data;
    }
}

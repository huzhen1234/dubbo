package com.hutu.consumer.dubbo.consumer.controller;


import com.hutu.common.dubbo.api.DemoService;
import com.hutu.common.dubbo.api.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dubbo")
public class ConsumerController {

    @DubboReference
    private DemoService demoService;

    @DubboReference
    private StudentService studentService;



    @GetMapping("hello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }

    @GetMapping("name")
    public String getName(String name) {
        return studentService.getStudentName(name);
    }
}

package com.hutu.provider.dubbo.service;

import com.hutu.common.dubbo.api.DemoService;
import com.hutu.common.dubbo.api.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class StudentServiceImpl implements StudentService {

    @Override
    public String getStudentName(String name) {
        return "hello" + name;
    }
}
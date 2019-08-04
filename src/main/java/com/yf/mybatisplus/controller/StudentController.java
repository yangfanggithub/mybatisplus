package com.yf.mybatisplus.controller;

import com.yf.mybatisplus.bean.Student;
import com.yf.mybatisplus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang fang
 * @version 0.0.1
 * @date 2019-08-04 20:25
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable String id){
        return studentService.getById(id);
    }

}

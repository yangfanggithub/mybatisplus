package com.yf.mybatisplus.service;

import com.yf.mybatisplus.bean.Student;

/**
 * @author yang fang
 * @version 0.0.1
 * @date 2019-08-04 20:24
 */
public interface IStudentService {

    Student getById(String id);
}

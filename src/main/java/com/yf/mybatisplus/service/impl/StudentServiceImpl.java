package com.yf.mybatisplus.service.impl;

import com.yf.mybatisplus.bean.Student;
import com.yf.mybatisplus.dao.StudentDao;
import com.yf.mybatisplus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yang fang
 * @version 0.0.1
 * @date 2019-08-04 20:24
 */
@Service
public class StudentServiceImpl implements IStudentService {

        @Autowired
        private StudentDao studentDao;

        @Override
        public Student getById(String id){
            return studentDao.selectById(id);
        }


}

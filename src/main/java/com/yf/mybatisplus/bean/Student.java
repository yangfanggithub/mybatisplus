package com.yf.mybatisplus.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author yang fang
 * @version 0.0.1
 * @date 2019-08-04 20:22
 */
@Data
public class Student {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer age;

    private String name;


}

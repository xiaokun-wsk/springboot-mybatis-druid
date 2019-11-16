package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Table;


/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: boot-mybatis-com.example.demo.pojo-User
 * date: 2019/11/15 9:03
 */
@Table(name = "user") //指定数据库的表明
@Data                              //get，set
@NoArgsConstructor                 //无参构造
@AllArgsConstructor                //有参构造
public class User {
    @javax.persistence.Id            //表示这是一个ID字段
    @KeySql(useGeneratedKeys = true) //设置ID自动增长
    private Long Id;
    private String address;
    private Integer age;
    private String gender;
    private String sname;
}
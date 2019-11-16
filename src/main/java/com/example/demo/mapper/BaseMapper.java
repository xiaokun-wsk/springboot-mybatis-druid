package com.example.demo.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;


//tk.mybatis.mapper.common.special.InsertListMapper;//这个批量新增对Id有要求必须是id的名称必须是id不可以是自定义的
//tk.mybatis.mapper.additional.insert.InsertListMapper;//这个包下的批量新增对Id没有要求（可以是自己定义的）

//共用的Mapper可以实现最基本的CURD以及批量的操作
@RegisterMapper  //通用Mapper都需要加上这个注解
public interface BaseMapper<T> extends Mapper<T>, IdListMapper<T,Long>, InsertListMapper<T> {
    //IdListMapper<T,Long> Long表示实体类对应的主键ID的类型
}

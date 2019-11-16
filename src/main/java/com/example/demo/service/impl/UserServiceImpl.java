package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: boot-mybatis-com.example.demo.service-UserServiceImpl
 * date: 2019/11/15 9:11
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;


    //查询全部
    @Override
    public List<User> findAll() {
        return this.userMapper.selectAll();
    }

    //插入
    @Override
    public String insterUser(User user) {
        Integer num=this.userMapper.insert(user);
        return   num==1?"插入成功":"插入失败";
    }

    //修改(这里修改是ID保持一致把原本的数据覆盖掉)
    @Override
    public String updateUser(User user) {
        int num = this.userMapper.updateByPrimaryKeySelective(user);
        return num==1?"修改成功":"修改失败";
    }

    //删除根据ID进行删除
    @Override
    public String deleteUser(Long Id) {
        int num = this.userMapper.deleteByPrimaryKey(Id);
        return num==1?"删除成功":"删除失败";
    }
}

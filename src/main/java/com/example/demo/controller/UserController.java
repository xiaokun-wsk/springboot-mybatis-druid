package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: boot-mybatis-com.example.demo.controller-UserController
 * date: 2019/11/15 9:02
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //查询全部User
    @GetMapping("findAllUser")
    public List<User> findAll(){
        return this.userService.findAll();
    }

    //新增User
    @GetMapping("insertUser")
    public String insertUser(User user){
        user.setAddress("北京朝阳");
        user.setAge(22);
        user.setGender("男");
        user.setSname("Spring Boot");

        //调用插入
        return this.userService.insterUser(user);
    }
    //修改User
    @GetMapping("updateUser")
    public String updateUser(User user){
        user=new User(7l,"北京长安街",23,"男","Spring Cloud");
        return this.userService.updateUser(user);
    }
    //删除User
    @GetMapping("deleteUser")
    public String deleteUser(Long id){
        id=6l;
        return this.userService.deleteUser(id);
    }
}

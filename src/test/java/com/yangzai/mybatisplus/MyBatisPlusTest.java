package com.yangzai.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.yangzai.mybatisplus.mapper.UserMapper;
import com.yangzai.mybatisplus.entity.User;
import com.yangzai.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelectList(){

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }

    @Test
    public void testinsert() {

        User user1 = new User();
        user1.setAge(23);
        user1.setName("gzx");
        user1.setEmail("5Chole@163.com");
        int result = userMapper.insert(user1);
        System.out.println(user1.getId());

    }

    @Autowired
    UserService userService;
    @Test
    public void testService(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","age");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        Map<String, Object> map = maps.get(1);
        System.out.println(map.values());
        System.out.println(map.toString());
        System.out.println(map.keySet());
        System.out.println(map.get("name"));
    }

    @Test
    public void testUpdateWrapper(){




        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",1);
//        updateWrapper.set("name","gzx");
        User user = userMapper.selectById(0L);
        userMapper.update(user,updateWrapper);

        userMapper.insert(user);

        String username = "";
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(StringUtils.isNotBlank(username),User::getName,username);
    }

}

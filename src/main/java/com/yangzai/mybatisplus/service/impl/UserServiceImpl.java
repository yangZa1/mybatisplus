package com.yangzai.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangzai.mybatisplus.entity.User;
import com.yangzai.mybatisplus.service.UserService;
import com.yangzai.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 1161938942
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-09-06 14:44:45
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





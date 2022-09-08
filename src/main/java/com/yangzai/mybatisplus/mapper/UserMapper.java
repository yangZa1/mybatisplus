package com.yangzai.mybatisplus.mapper;
import org.apache.ibatis.annotations.Param;

import com.yangzai.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 1161938942
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-09-06 14:44:45
* @Entity com.yangzai.mybatisplus.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
//    int insertSelective(User user);

}





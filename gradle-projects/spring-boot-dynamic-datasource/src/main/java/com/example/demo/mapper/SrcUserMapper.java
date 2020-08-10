package com.example.demo.mapper;

import com.example.demo.model.SrcUser;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SrcUserMapper {

    SrcUser getSrcUser(Integer userNum);

    int deleteSrcUser(Integer userNum);

    int addSrcUser(User user);

    @Select("select * from src_user")
    List<User> query();
}
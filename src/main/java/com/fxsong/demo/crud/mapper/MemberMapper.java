package com.fxsong.demo.crud.mapper;

import com.fxsong.demo.crud.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<Member> selectList();
}

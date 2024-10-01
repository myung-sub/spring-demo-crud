package com.fxsong.demo.crud.post.comment;

import com.fxsong.demo.crud.system.CamelMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<CamelMap> selectList(Long postId);
}

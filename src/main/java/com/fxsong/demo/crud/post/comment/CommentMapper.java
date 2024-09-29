package com.fxsong.demo.crud.post.comment;

import com.fxsong.demo.crud.base.CamelMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommentMapper {

    List<CamelMap> selectList(Long postId);
}

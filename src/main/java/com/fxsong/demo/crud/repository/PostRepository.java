package com.fxsong.demo.crud.repository;

import com.fxsong.demo.crud.model.Post;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
    List<Post> findByMemberId(Integer memberId);
}

package com.fxsong.demo.crud.post;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PostRepository extends ListCrudRepository<Post, Long> {
    List<Post> findByMemberId(Long memberId);
}

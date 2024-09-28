package com.fxsong.demo.crud.post.comment;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface CommentRepository extends ListCrudRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);
}

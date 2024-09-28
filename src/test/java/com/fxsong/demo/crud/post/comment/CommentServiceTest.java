package com.fxsong.demo.crud.post.comment;

import com.fxsong.demo.crud.post.comment.Comment;
import com.fxsong.demo.crud.post.comment.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CommentServiceTest {
    @Autowired
    CommentService service;

    @Test
    void create() {
        // given
        Comment comment = Comment.builder()
                .postId(1L)
                .content("test")
                .memberId(1L)
                .build();

        // when
        Comment saved = service.create(comment);

        // then
        assertNotNull(saved.getId());
    }

}
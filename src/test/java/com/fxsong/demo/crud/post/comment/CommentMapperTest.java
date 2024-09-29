package com.fxsong.demo.crud.post.comment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class CommentMapperTest {

    @Autowired
    CommentMapper mapper;

    @Test
    void selectList() {
        // given
        Long postId = 2L;

        // when
        var comments = mapper.selectList(postId);

        // then
        Assertions.assertThat(comments.size()).isEqualTo(2);

        comments.forEach(item -> System.out.println(item.getString("memberName")));
    }
}
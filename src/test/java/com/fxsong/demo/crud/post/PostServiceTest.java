package com.fxsong.demo.crud.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostServiceTest {

    @Autowired
    PostService service;

    @Test
    void findByMemberId() {
        // when
        var posts = service.findByMemberId(1L);

        // then
        assertEquals(2, posts.size());
    }
}
package com.fxsong.demo.crud.post.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CommentControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void list() throws Exception {
        // given
        Long postId = 1L;
        String url = String.format("/api/posts/%d/comments", postId);

        mvc
                // when
                .perform(get(String.format("/api/posts/%d/comments", postId)))

                // then
                .andDo(print())
                .andExpect(status().isOk())
        ;

    }

}
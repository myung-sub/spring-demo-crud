package com.fxsong.demo.crud.member;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fxsong.demo.crud.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MemberControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void list() throws Exception {
        mvc
                // when
                .perform(get("/api/members"))

                // then
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print())
                ;

    }

    @Test
    void create() throws Exception {
        // given
        Member member = Member.builder()
                .name("test")
                .build();

        mvc
                // when
                .perform(post("/api/members")
                        .content(objectMapper.writeValueAsString(member))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))

                // then
                .andExpect(status().isOk())
        ;
    }

}
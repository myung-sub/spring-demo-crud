package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.member.MemberMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MemberMapperTest {

    @Autowired
    MemberMapper mapper;

    @Test
    void selectList() {
        Assertions.assertThat(mapper.selectList().size()).isNotZero();
    }
}
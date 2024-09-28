package com.fxsong.demo.crud.mapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MemberMapperTest {

    @Autowired
    MemberMapper mapper;

    @Test
    void selectList() {
        Assertions.assertThat(mapper.selectList().size()).isNotZero();
    }
}
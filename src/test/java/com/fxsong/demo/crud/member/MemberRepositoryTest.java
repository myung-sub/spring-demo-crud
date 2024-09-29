package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.member.Member;
import com.fxsong.demo.crud.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    void findByName() {
        String name = "fxsong";
        assertEquals(1, repository.findByName(name).size());
    }

    @Test
    void save() {
        Member member = Member.builder()
                .name("asdf")
                .build();

        repository.save(member);
        assertEquals(1, repository.findByName("asdf").size());
    }

    @Test
    void delete() {
        Long id = 1L;
        repository.deleteById(id);
        Optional<Member> member = repository.findById(id);
        assertFalse(member.isPresent());
    }

    @Test
    void update() {
        Long id = 1L;
        Member member = repository.findById(id).get();
        member.setName("new name");
        repository.save(member);
        assertEquals("new name", repository.findById(id).get().getName());
    }
}
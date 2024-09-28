package com.fxsong.demo.crud.repository;

import com.fxsong.demo.crud.model.Member;
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
        Member member = new Member();
        member.setName("asdf");
        repository.save(member);
        assertEquals(1, repository.findByName("asdf").size());
    }

    @Test
    void delete() {
        Integer id = 1;
        repository.deleteById(id);
        Optional<Member> member = repository.findById(id);
        assertFalse(member.isPresent());
    }

    @Test
    void update() {
        Integer id = 1;
        Member member = repository.findById(id).get();
        member.setName("new name");
        repository.save(member);
        assertEquals("new name", repository.findById(id).get().getName());
    }
}
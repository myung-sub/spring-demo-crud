package com.fxsong.demo.crud.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
class PostRepositoryTest {

    @Autowired
    private PostRepository repository;

    @Test
    void findAll() {
        assertEquals(2, repository.findAll().size());
    }

    @Test
    void findById() {
        Integer id = 1;
        assertEquals(id, repository.findById(id).get().getId());
    }

}
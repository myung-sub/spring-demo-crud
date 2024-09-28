package com.fxsong.demo.crud.repository;

import com.fxsong.demo.crud.model.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MemberRepository extends ListCrudRepository<Member, Integer> {
    List<Member> findByName(String name);
}

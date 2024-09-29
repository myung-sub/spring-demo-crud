package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.member.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    List<Member> findByName(String name);
}

package com.fxsong.demo.crud.service;

import com.fxsong.demo.crud.model.Member;
import com.fxsong.demo.crud.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository repository;

    public Member findOne(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Member create(Member newMember) {
        return repository.save(newMember);
    }

    public Member modify(Member member) {
        return repository.save(member);
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

}

package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.base.CrudServiceImpl;
import com.fxsong.demo.crud.member.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService extends CrudServiceImpl<Member, Long> {

    public MemberService(MemberRepository repo) {
        super(repo);
    }
}

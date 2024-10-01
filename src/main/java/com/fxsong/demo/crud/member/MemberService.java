package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.system.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService extends CrudServiceImpl<Member, Long> {

    public MemberService(MemberRepository repo) {
        super(repo);
    }
}

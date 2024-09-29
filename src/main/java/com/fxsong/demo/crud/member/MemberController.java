package com.fxsong.demo.crud.member;

import com.fxsong.demo.crud.base.CrudController;
import com.fxsong.demo.crud.base.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController extends CrudController<Member, Long> {

    private final MemberMapper mapper;

    public MemberController(CrudService<Member, Long> service, MemberMapper mapper) {
        super(service);
        this.mapper = mapper;
    }

    @GetMapping
    List<Member> getMembers() {
        return mapper.selectList();
    }

}

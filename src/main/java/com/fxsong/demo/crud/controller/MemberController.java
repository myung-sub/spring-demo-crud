package com.fxsong.demo.crud.controller;

import com.fxsong.demo.crud.mapper.MemberMapper;
import com.fxsong.demo.crud.model.Member;
import com.fxsong.demo.crud.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;
    private final MemberMapper mapper;

    @GetMapping
    List<Member> getMembers() {
        return mapper.selectList();
    }

    @GetMapping("/{id}")
    Member getMember(@PathVariable Integer id) {
        return service.findOne(id);
    }

    @PostMapping
    Member createMember(@RequestBody Member newMember) {
        return service.create(newMember);
    }

    @PutMapping("/{id}")
    Member modifyMember(@PathVariable Integer id, @RequestBody Member member) {
        member.setId(id);
        return service.modify(member);
    }

    @DeleteMapping("/{id}")
    void removeMember(@PathVariable Integer id) {
        service.remove(id);
    }

}

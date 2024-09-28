package com.fxsong.demo.crud.member;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TB_MEMBER")
@Data
@Builder
public class Member {
    @Id
    private Integer id;
    private String name;
}

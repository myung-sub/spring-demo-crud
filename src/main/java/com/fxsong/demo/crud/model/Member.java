package com.fxsong.demo.crud.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("TB_MEMBER")
public class Member {
    @Id
    private Integer id;
    private String name;
}

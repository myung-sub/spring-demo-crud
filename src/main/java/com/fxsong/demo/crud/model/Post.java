package com.fxsong.demo.crud.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TB_POST")
@Data
public class Post {
    @Id
    private Integer id;
    private Integer memberId;
    private String title;
    private String body;
}

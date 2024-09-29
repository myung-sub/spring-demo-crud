package com.fxsong.demo.crud.post;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TB_POST")
@Data
@Builder
public class Post {
    @Id
    private Long id;
    private Long memberId;
    private String title;
    private String body;
}

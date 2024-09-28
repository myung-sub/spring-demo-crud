package com.fxsong.demo.crud.post.comment;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TB_POST_COMMENT")
@Data
@Builder
public class Comment {

    @Id
    private Long id;
    private Long postId;
    private String content;
    private Long memberId;
}

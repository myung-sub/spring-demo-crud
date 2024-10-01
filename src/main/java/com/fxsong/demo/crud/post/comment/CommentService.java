package com.fxsong.demo.crud.post.comment;

import com.fxsong.demo.crud.system.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommentService extends CrudServiceImpl<Comment, Long> {

    public CommentService(CommentRepository repo) {
        super(repo);
    }

}

package com.fxsong.demo.crud.post;

import com.fxsong.demo.crud.base.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostService extends CrudServiceImpl<Post, Long> {

    public PostService(PostRepository repo) {
        super(repo);
    }
}

package com.fxsong.demo.crud.post;

import com.fxsong.demo.crud.system.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostService extends CrudServiceImpl<Post, Long> {

    public PostService(PostRepository repo) {
        super(repo);
    }

    public List<Post> findByMemberId(Long memberId) {
        return ((PostRepository)repo).findByMemberId(memberId);
    }
}

package com.fxsong.demo.crud.post.comment;

import com.fxsong.demo.crud.system.CamelMap;
import com.fxsong.demo.crud.system.CrudController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts/{postId}/comments")
public class CommentController extends CrudController<Comment, Long> {

    private final CommentMapper mapper;

    public CommentController(CommentService service, CommentMapper mapper) {
        super(service);
        this.mapper = mapper;
    }

    @GetMapping
    public List<CamelMap> list(@PathVariable Long postId) {
        return mapper.selectList(postId);
    }
}

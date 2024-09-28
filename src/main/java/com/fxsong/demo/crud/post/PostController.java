package com.fxsong.demo.crud.post;

import com.fxsong.demo.crud.base.CrudController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController extends CrudController<Post, Long> {

    private final PostMapper mapper;

    public PostController(PostService service, PostMapper mapper) {
        super(service);
        this.mapper = mapper;
    }

    @GetMapping
    List<Post> selectList() {
        return mapper.selectList();
    }
}

package com.fxsong.demo.crud;

import com.fxsong.demo.crud.member.Member;
import com.fxsong.demo.crud.member.MemberRepository;
import com.fxsong.demo.crud.member.MemberService;
import com.fxsong.demo.crud.post.Post;
import com.fxsong.demo.crud.post.PostRepository;
import com.fxsong.demo.crud.post.PostService;
import com.fxsong.demo.crud.post.comment.Comment;
import com.fxsong.demo.crud.post.comment.CommentRepository;
import com.fxsong.demo.crud.post.comment.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitRunner implements ApplicationRunner {

    private final MemberService memberService;
    private final PostService postService;
    private final CommentService commentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Member member = Member.builder().name("Alice").build();
        Long memberId = memberService.create(member).getId();

        Post post1 = Post.builder().title("test1").body("test1 is ...").memberId(memberId).build();
        Long post1Id = postService.create(post1).getId();

        Post post2 = Post.builder().title("test2").body("test2 is ...").memberId(memberId).build();
        Long post2Id = postService.create(post2).getId();

        Comment comment1 = Comment.builder().postId(post2Id).content("comment1 ...").memberId(memberId).build();
        Comment comment2 = Comment.builder().postId(post2Id).content("comment2 ...").memberId(memberId).build();
        commentService.create(comment1);
        commentService.create(comment2);
    }
}

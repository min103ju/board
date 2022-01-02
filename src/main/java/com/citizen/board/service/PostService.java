package com.citizen.board.service;

import com.citizen.board.domain.Car;
import com.citizen.board.domain.Car.CarBuilder;
import com.citizen.board.domain.Post;
import com.citizen.board.domain.Post.PostBuilder;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    public void basicConstructor() {

//        Post post = new Post();
//        post.setTitle("title");
//        post.setAuthor("author");
//        post.setContent("content");

    }

    public void staticFactory() {

//        Post.ofTitle("title");
//        Post.ofTitleAndContent("title", "content");

    }

    public void builderPattern() {
//        PostBuilder builder = Post.builder("title", "content");
//        builder.author("author");
//        Post build = builder.build();
    }

    public void lombokBuilderPattern() {
        // (1) Class @Builder
        Post post1 = Post.allBuilder()
            .id(1L)
            .title("title")
            .content("content")
            .author("author")
            .build();

        // (2) Method @Builder
        Post post2 = Post.allBuilder()
            .title("title")
            .content("conent")
            .build();

        Post post3 = Post.postTitleBuilder()
            .title("title")
            .build();

        Post post4 = Post.postTitleAndContentBuilder()
            .title("title")
            .content("content")
            .build();

        PostBuilder postBuilder = post1.toBuilder();
        Post update_title = postBuilder.title("update title")
            .build();

    }

}

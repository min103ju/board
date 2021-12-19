package com.citizen.board.service;

import com.citizen.board.domain.Car;
import com.citizen.board.domain.Car.CarBuilder;
import com.citizen.board.domain.Post;

public class PostService {

    public void basicConstructor() {

        Post post = new Post();
        post.setTitle("title");
        post.setAuthor("author");
        post.setContent("content");

    }

    public void staticFactory() {

        Post.ofTitle("title");
        Post.ofTitleAndContent("title", "content");

    }

    public void builderPattern() {

        CarBuilder builder = Car.builder("name", "number");
        builder.size(0);
        Car build = builder.build();

    }

}

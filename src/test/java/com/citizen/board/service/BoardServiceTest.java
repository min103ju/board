package com.citizen.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    private PostService postService;

    @Test
    void Builder_Default_테스트() {
        postService.lombokBuilderPattern();
    }

}

package com.citizen.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@NoArgsConstructor
public class Post extends BaseTimeEntity {

    @Id
    private Long id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private String author;

    public Post(String title) {
        new Post(null, title, null, null);
    }

    public Post(String title, String content) {
        new Post(null, title, content, null);
    }

    public Post(String title, String content, String author) {
        new Post(null, title, content, author);
    }

    public Post(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static Post ofTitle(String title) {
        Post post = new Post();
        post.title = title;
        return post;
    }

    public static Post ofTitleAndContent(String title, String content) {
        Post post = new Post();
        post.title = title;
        post.content = content;
        return post;
    }

}

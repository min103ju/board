package com.citizen.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Entity
@ToString
@Builder(builderClassName = "PostBuilder", builderMethodName = "allBuilder", toBuilder = true)
public class Post extends BaseTimeEntity {

    @Id
    private Long id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Builder.Default
    private String author = "default author";

    @Builder(builderClassName = "PostTitleBuilder", builderMethodName = "postTitleBuilder")
    public Post(String title) {
        this.title = title;
    }

    @Builder(builderClassName = "PostTitleAndContentBuilder", builderMethodName = "postTitleAndContentBuilder")
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static PostBuilder builder(String title, String content) {
        return allBuilder()
            .title(title)
            .content(content);
    }

    public Post(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /* Static Factory Method */
//    public static Post ofTitle(String title) {
//        Post post = new Post();
//        post.title = title;
//        return post;
//    }

//    public static Post ofTitleAndContent(String title, String content) {
//        Post post = new Post();
//        post.title = title;
//        post.content = content;
//        return post;
//    }

    /* Builder Pattern */
//    public static PostBuilder builder(String title, String content) {
//        return new PostBuilder(title, content);
//    }
//
//    public static class PostBuilder {
//
//        private String title;
//        private String content;
//        private String author;
//
//        public PostBuilder(String title, String content) {
//            this.title = title;
//            this.content = content;
//        }
//
//        public PostBuilder author(String author) {
//            this.author = author;
//            return this;
//        }
//
//        public Post build() {
//            return new Post(this.title, this.content, this.author);
//        }
//
//    }


}

package com.zipcode.gjblog.blogmodel;

import javax.persistence.*;

@Entity
@Table(name = "POST")
public class Post {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long postId;

    @Column(name = "user_name")
    String userName;

    @Column(name = "tag")
    String tag;


    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn (name = "post_content_id")
    PostContent postContent;

    public PostContent getPostContent() {
        return postContent;
    }

    public void setPostContent(PostContent postContent) {
        this.postContent = postContent;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

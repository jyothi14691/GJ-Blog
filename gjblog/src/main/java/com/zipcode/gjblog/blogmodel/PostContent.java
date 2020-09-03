package com.zipcode.gjblog.blogmodel;

import javax.persistence.*;


@Entity
@Table(name = "POSTCONTENT")
public class PostContent {

    @Id
    @Column(name="post_content_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long postContentId;

    @Column(name="text_input")
    String textInput;

    @Column(name = "image_key")
    private String image_Key;


    public String getImage_Key() {
        return image_Key;
    }

    public void setImage_Key(String image_Key) {
        this.image_Key = image_Key;
    }

    public Long getPostContentId() {
        return postContentId;
    }

    public void setPostContentId(Long postContentId) {
        this.postContentId = postContentId;
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

}

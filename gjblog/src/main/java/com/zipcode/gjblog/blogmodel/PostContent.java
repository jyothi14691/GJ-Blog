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

    @Column(name="data_input")
    private String dataInput;


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

    public String getDataInput() {
        return dataInput;
    }

    public void setDataInput(String dataInput) {
        this.dataInput = dataInput;
    }


}

package com.lads.retrofit;

import com.google.gson.annotations.SerializedName;

class Comment {
    private int PostId;
    private int id;
    private String name;
    private String email;
    @SerializedName("body")
    private String text;

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

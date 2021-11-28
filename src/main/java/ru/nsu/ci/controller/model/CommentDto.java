package ru.nsu.ci.controller.model;

import java.time.LocalDateTime;

import ru.nsu.ci.entity.Comment;

public class CommentDto {

    private int id;
    private String description;
    private LocalDateTime creationDateTime;

    public CommentDto(Comment comment) {
        this.id = comment.id();
        this.description = comment.description();
        this.creationDateTime = comment.creationDateTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}

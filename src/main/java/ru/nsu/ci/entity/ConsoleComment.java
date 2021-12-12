package ru.nsu.ci.entity;

import java.time.LocalDateTime;

public class ConsoleComment implements Comment {

    // добавить нужные поля, конструкторы и методы

    private Integer id;
    private String comment;
    private String description;
    private LocalDateTime creationDateTime;

    @Override
    public Integer id() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String comment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDateTime creationDateTime() {
        return creationDateTime;
    }

    @Override
    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}

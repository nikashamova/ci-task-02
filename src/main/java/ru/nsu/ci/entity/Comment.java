package ru.nsu.ci.entity;

import java.time.LocalDateTime;

public interface Comment {
    Integer id();

    void setId(Integer id);

    String comment();

    void setComment(String comment);

    String description();

    void setDescription(String description);

    LocalDateTime creationDateTime();

    void setCreationDateTime(LocalDateTime creationDateTime);
}

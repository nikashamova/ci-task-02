package ru.nsu.ci.entity;

import java.time.LocalDateTime;
import java.util.List;

public interface Task {

    Integer id();

    void id(Integer id);

    String title();

    void title(String title);

    String description();

    void description(String title);

    LocalDateTime finishDateTime();

    void finishDateTime(LocalDateTime finishDateTime);

    List<Comment> comments();

    boolean isReady();

    void finish();

    void unFinish();

    void add(Comment comment);

    void remove(Integer commentId);
}

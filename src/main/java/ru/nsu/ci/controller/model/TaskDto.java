package ru.nsu.ci.controller.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ru.nsu.ci.entity.Task;

public class TaskDto {

    private Integer id;
    private String title;
    private String description;
    private LocalDateTime finishDateTime;
    private boolean ready;
    private List<CommentDto> comments;

    public TaskDto(Task task) {
        this.id = task.id();
        this.title = task.title();
        this.description = task.description();
        this.finishDateTime = task.finishDateTime();
        this.ready = task.isReady();
        if (task.comments() != null) {
            this.comments = task.comments().stream()
                .map(CommentDto::new)
                .collect(Collectors.toList());
        } else {
            this.comments = new ArrayList<>();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getFinishDateTime() {
        return finishDateTime;
    }

    public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }
}

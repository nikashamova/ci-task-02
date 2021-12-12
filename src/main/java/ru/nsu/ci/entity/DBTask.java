package ru.nsu.ci.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "tasks")
public class DBTask implements Task {

    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "finish_date_time")
    private LocalDateTime finishDateTime;
    @Column(name = "ready")
    private boolean ready;
    @OneToMany
    @JoinColumn(name = "task_id")
    private List<DBComment> comments;

    @Override
    public Integer id() {
        return id;
    }

    @Override
    public void id(Integer id) {
        this.id = id;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public void title(String title) {
        this.title = title;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public void description(String description) {
        this.description = description;
    }

    @Override
    public LocalDateTime finishDateTime() {
        return finishDateTime;
    }

    @Override
    public void finishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    @Override
    public List<Comment> comments() {
        return comments.stream().map(dbComment -> ((Comment) dbComment)).collect(Collectors.toList());
    }

    @Override
    public boolean isReady() {
        return ready;
    }

    @Override
    public void finish() {
        ready = true;
    }

    @Override
    public void unFinish() {
        ready = false;
    }

    @Override
    public void add(Comment comment) {

    }

    @Override
    public void remove(Integer commentId) {

    }

}

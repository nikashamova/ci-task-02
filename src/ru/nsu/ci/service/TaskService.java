package ru.nsu.ci.service;

import java.time.LocalDateTime;
import java.util.List;

import ru.nsu.ci.entity.Task;

public interface TaskService {

    List<Task> listAllTasks();

    List<Task> listAllUnfinishedTasks();

    List<Task> listAllFinishedTasks();

    // получить те задачи, которые нужно закончить в ближайшие dayCount дней
    List<Task> listAllTasksDueTo(int dayCount);

    // получить просроченные задачи
    List<Task> listAllOverdueTasks();

    List<String> listAllTaskTitles();

    List<String> listAllUnfinishedTaskTitles();

    void addTask(String title, String description, LocalDateTime finishDateTime);

    void addTask(String title, String description);

    void removeTask(Integer taskId);

    void removeTask(String title);

    void addComment(Integer taskId, String text);

    void markAsFinished(Integer taskId);

    void markAsUnFinished(Integer taskId);
}

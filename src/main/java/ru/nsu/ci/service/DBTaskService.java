package ru.nsu.ci.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ru.nsu.ci.entity.DBTask;
import ru.nsu.ci.entity.Task;
import ru.nsu.ci.repo.DBTaskRepository;

@Service
public class DBTaskService implements TaskService {

    private final DBTaskRepository repository;

    public DBTaskService(DBTaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> listAllTasks() {
        return repository.findAll().stream().map(task -> ((Task) task)).collect(Collectors.toList());
    }

    @Override
    public List<Task> listAllUnfinishedTasks() {
        return null;
    }

    @Override
    public List<Task> listAllFinishedTasks() {
        return null;
    }

    @Override
    public List<Task> listAllTasksDueTo(int dayCount) {
        return null;
    }

    @Override
    public List<Task> listAllOverdueTasks() {
        return null;
    }

    @Override
    public List<String> listAllTaskTitles() {
        return null;
    }

    @Override
    public List<String> listAllUnfinishedTaskTitles() {
        return null;
    }

    @Override
    public void addTask(String title, String description, LocalDateTime finishDateTime) {
        DBTask task = new DBTask();
        task.title(title);
        task.description(description);
        task.finishDateTime(finishDateTime);
        repository.save(task);
    }

    @Override
    public void addTask(String title, String description) {
        addTask(title, description, LocalDateTime.now());
    }

    @Override
    public void removeTask(Integer taskId) {

    }

    @Override
    public void removeTask(String title) {

    }

    @Override
    public void addComment(Integer taskId, String text) {

    }

    @Override
    public void markAsFinished(Integer taskId) {
    }

    @Override
    public void markAsFinished(String title) {
        DBTask task = repository.findByTitle(title);
        task.finish();
        repository.save(task);
    }

    @Override
    public void markAsUnFinished(Integer taskId) {

    }

    @Override
    public void markAsUnFinished(String title) {
        DBTask task = repository.findByTitle(title);
        task.finish();
        repository.save(task);
    }
}

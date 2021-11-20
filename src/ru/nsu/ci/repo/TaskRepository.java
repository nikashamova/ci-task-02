package ru.nsu.ci.repo;

import java.util.List;

import ru.nsu.ci.entity.Task;

public interface TaskRepository {

    void save(Task task);

    void deleteById(Integer id);

    List<Task> findAll();

    Task findById(Integer id);

    void update(Task task);
}

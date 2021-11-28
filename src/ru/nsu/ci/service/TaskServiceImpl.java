package ru.nsu.ci.service;

import ru.nsu.ci.repo.ConsoleTaskRepository;
import ru.nsu.ci.repo.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository = new ConsoleTaskRepository();


}

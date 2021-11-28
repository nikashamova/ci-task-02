package ru.nsu.ci.repo;

import java.util.HashMap;
import java.util.Map;

import ru.nsu.ci.entity.Task;

public class ConsoleTaskRepository implements TaskRepository {

    // хранение задач с помощью Map<Integer, Task>, где ключ -- id таски
    private final Map<Integer, Task> tasks = new HashMap<>();

}

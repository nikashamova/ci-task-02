package ru.nsu.ci.controller;

import ru.nsu.ci.service.ConsoleTaskService;
import ru.nsu.ci.service.TaskService;

public class ConsoleTaskController {

    private final TaskService taskService = new ConsoleTaskService();

    // добавить новую задачу
    public void addTask(String title, String description) {
        taskService.addTask(title, description);
    }

    // добавить следующие методы:

    // добавить новую задачу вместе с датой завершения
    // отметить задачу как выполненную
    // добавить новый комментарий к задаче
    // удалить задачу по id
    // удалить задачу по названию
    // получить все задачи
    // получить все невыполненные задачи
    // получить все архивные (выполненные) задачи
    // получить те задачи, которые нужно закончить в ближайшие 7/14/28 дней
    // получить просроченные задачи

}

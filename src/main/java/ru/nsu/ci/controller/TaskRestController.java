package ru.nsu.ci.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.nsu.ci.controller.model.TaskDto;
import ru.nsu.ci.service.TaskService;
import ru.nsu.ci.service.TaskServiceImpl;

@RestController
@RequestMapping("tasks")
public class TaskRestController {

    private final TaskService taskService = new TaskServiceImpl();

    @GetMapping("/hello")
    public String hello() {
        return "Hello from tasks controller!";
    }

    @GetMapping("")
    public List<TaskDto> get() {
        return taskService.listAllTasks().stream()
            .map(TaskDto::new)
            .collect(Collectors.toList());
    }

    @PostMapping("")
    public void addTask(String title, String description) {
        taskService.addTask(title, description);
    }

    @PostMapping("finish")
    public void finishTask(String title) {
        taskService.markAsFinished(title);
    }

    @PostMapping("unfinish")
    public void unFinishTask(String title) {
        taskService.markAsUnFinished(title);
    }

    //toDo: добавить метод для добавления комментария по заголовку заметки

    //toDo: добавить метод для удаления комментария по заголовку заметки

    //toDo: если потребуется, можно добавить новые методы в сервис TaskService и его реализацию

}

package ru.nsu.ci;

import ru.nsu.ci.controller.ConsoleTaskController;

public class Main {

    public static void main(String[] args) {
        ConsoleTaskController controller = new ConsoleTaskController();
        controller.addTask("Buy almond milk", "Buy milk after work");
    }
}

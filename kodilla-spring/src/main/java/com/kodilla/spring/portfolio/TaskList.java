package com.kodilla.spring.portfolio;

import java.util.*;

public class TaskList {
    List<String> tasks=new ArrayList<>();

    public TaskList(List<String> tasks) {
        this.tasks=tasks;
    }

    public List<String> getTasks() {
        //tasks = new ArrayList<>();
        return tasks;
    }
}

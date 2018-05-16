package com.kodilla.spring.portfolio;

import java.util.*;

public class TaskList {
    private List<String> tasks=new ArrayList<>();

    public TaskList(final List<String> tasks) {
    }

    public List<String> getTasks() {
        return tasks;
    }
}
package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("listDone")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }
    @Bean(name = "listDone")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> listDone = new ArrayList<>();
        listDone.add("1. task");
        return new TaskList(listDone);
    }
    @Bean(name = "listToDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> listToDo = new ArrayList<>();
        listToDo.add("2. task");
        return new TaskList(listToDo);
    }
    @Bean(name = "listInProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> listInProgress = new ArrayList<>();
        listInProgress.add("3. task");
        return new TaskList(listInProgress);
    }
}

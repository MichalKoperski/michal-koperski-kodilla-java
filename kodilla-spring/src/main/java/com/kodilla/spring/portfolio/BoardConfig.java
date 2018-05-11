package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getDoneList(), getInProgressList());
    }
    @Bean(name = "listDone")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> listDone = new ArrayList<>();
        return new TaskList(listDone);
    }
    @Bean(name = "listToDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> listToDo = new ArrayList<>();
        return new TaskList(listToDo);
    }
    @Bean(name = "listInProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> listInProgress = new ArrayList<>();
        return new TaskList(listInProgress);
    }
}

package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        System.out.println(board.getDoneList());
        //When & Then
        List<String> a = board.getDoneList().getTasks();
        a.add("task1");

        List<String> b = board.getToDoList().getTasks();
        b.add("task2");

        List<String> c = board.getInProgressList().getTasks();
        c.add("task3");

        Assert.assertEquals("task1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("task2", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task3", board.getInProgressList().getTasks().get(0));
    }
}

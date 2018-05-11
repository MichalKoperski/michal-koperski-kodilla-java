package com.kodilla.spring.portfolio;

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

        a.stream()
                .forEach(System.out::println);
    }

}

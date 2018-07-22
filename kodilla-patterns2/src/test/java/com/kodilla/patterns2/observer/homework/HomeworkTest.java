package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTest {
    @Test
    public void testUpdate() {
        //Given
        HomeworksStack student1homework = new HomeworksStack("Student 1");
        HomeworksStack student2homework = new HomeworksStack("Student 2");
        Mentor adam = new Mentor("Adam");
        Mentor iwona = new Mentor("Iwona");
        student1homework.registerObserver(adam);
        student2homework.registerObserver(iwona);
        //When
        student1homework.addHomework("Homework 1");
        student1homework.addHomework("Homework 2");
        student2homework.addHomework("Homework 3");
        student1homework.addHomework("Homework 4");
        student2homework.addHomework("Homework 5");
        //Then
        assertEquals(3, adam.getUpdateCount());
        assertEquals(2,iwona.getUpdateCount());
    }
}

package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }
    public void update(HomeworksStack homeworksStack) {
        System.out.println(username + ": New homework solution from " + homeworksStack.getName() + "\n" +
                " (total: " + homeworksStack.getHomeworks().size() + " homeworks)");
        updateCount++;
    }
    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}

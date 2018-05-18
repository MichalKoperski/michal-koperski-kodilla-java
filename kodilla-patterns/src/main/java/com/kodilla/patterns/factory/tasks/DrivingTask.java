package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    boolean isTaskExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getWhere() {
        return where;
    }
    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task is executed");
        isTaskExecuted = true;
    }
    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}

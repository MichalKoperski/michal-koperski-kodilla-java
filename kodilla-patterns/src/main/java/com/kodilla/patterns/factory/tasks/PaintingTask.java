package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getWhatToPaint() {
        return whatToPaint;
    }
    public String getColor() {
        return color;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task is executed");
    }
    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}

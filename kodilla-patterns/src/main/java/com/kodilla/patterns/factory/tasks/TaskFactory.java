package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "groceriers", 4);
            case PAINTING:
                return new PaintingTask("Painting","red","wall");
            case DRIVING:
                return new DrivingTask("Driving", "Warsaw", "car");
            default:
                return null;
        }

    }
}

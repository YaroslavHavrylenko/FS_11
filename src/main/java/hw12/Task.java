package hw12;

public enum Task {
    TASK1 ("Task 1"),
    TASK2 ("Task 2"),
    TASK3 ("Task 3"),
    TASK4 ("Task 4"),
    TASK5 ("Task 5"),
    TASK6 ("Task 6"),
    TASK7 ("Task 7");

    private final String task;

    Task(String task) { this.task = task;}

    @Override
    public String toString() {
        return task;
    }
}


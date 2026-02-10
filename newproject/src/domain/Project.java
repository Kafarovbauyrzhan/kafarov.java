package domain;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private int id;
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addTask(Task task) { tasks.add(task); }
    public List<Task> getTasks() { return tasks; }
}


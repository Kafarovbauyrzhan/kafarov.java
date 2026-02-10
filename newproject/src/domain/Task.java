package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Task {
    private int id;
    private String title;
    private Status status;
    private User responsible;
    private List<Task> subtasks = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.NEW;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public void setResponsible(User user) { this.responsible = user; }

    public void addSubtask(Task task) { subtasks.add(task); }
    public List<Task> getSubtasks() { return subtasks; }

    public void addComment(Comment c) { comments.add(c); }
}
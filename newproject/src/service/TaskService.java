package service;

import domain.*;
import exception.TaskNotFoundException;
import observer.Observer;
import repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private TaskRepository repo;
    private List<Observer> observers = new ArrayList<>();

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }

    public void createTask(Task task) {
        repo.add(task);
    }

    public void changeStatus(int id, Status status) {
        Task task = repo.findById(id);
        if (task == null) throw new TaskNotFoundException("Task not found");
        task.setStatus(status);
        repo.update(task);
        notifyObservers("Статус задачи " + task.getTitle() + " изменён");
    }

    public void deleteTask(int id) {
        repo.delete(id);
    }

    public List<Task> getAll() {
        return repo.findAll();
    }
}

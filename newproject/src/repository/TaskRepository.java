package repository;

import domain.Task;
import java.util.List;

public interface TaskRepository {
    void add(Task task);
    Task findById(int id);
    List<Task> findAll();
    void update(Task task);
    void delete(int id);
}


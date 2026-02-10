package repository;

import domain.Task;
import java.util.*;

public class InMemoryTaskRepository implements TaskRepository {

    private Map<Integer, Task> storage = new HashMap<>();

    public void add(Task task) {
        storage.put(task.getId(), task);
    }

    public Task findById(int id) {
        return storage.get(id);
    }

    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void update(Task task) {
        storage.put(task.getId(), task);
    }

    public void delete(int id) {
        storage.remove(id);
    }
}

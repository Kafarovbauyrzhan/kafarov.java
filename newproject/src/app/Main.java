package app;

import domain.*;
import observer.UserObserver;
import repository.InMemoryTaskRepository;
import service.TaskService;

public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskService(new InMemoryTaskRepository());

        User user = new User(1, "Alex");
        taskService.addObserver(new UserObserver("Manager"));

        Task bug = new BugTask(1, "Fix login", "HIGH");
        Task feature = new FeatureTask(2, "Add profile", 1);

        // CREATE
        taskService.createTask(bug);
        taskService.createTask(feature);

        // UPDATE
        taskService.changeStatus(1, Status.IN_PROGRESS);

        // READ
        for (Task t : taskService.getAll()) {
            System.out.println(t.getTitle() + " - " + t.getStatus());
        }

        // DELETE
        taskService.deleteTask(2);
    }
}

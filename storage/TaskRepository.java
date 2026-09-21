package PERSONAL_TASK_MANAGER.storage;

import PERSONAL_TASK_MANAGER.model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    private long nextId = 1;

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(nextId++);
            tasks.add(task);
        } else {
            removeById(task.getId());
            tasks.add(task);
        }
        return task;
    }

    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    public Optional<Task> findById(long id) {
        return tasks.stream()
               .filter(task -> task.getId().equals(id))
               .findFirst();
    }

    public boolean removeById(long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    public void clear() {
        tasks.clear();
        nextId = 1;
    }
}

package PERSONAL_TASK_MANAGER;

import PERSONAL_TASK_MANAGER.ui.ConsolUI;
import PERSONAL_TASK_MANAGER.services.TaskService;
import PERSONAL_TASK_MANAGER.storage.TaskRepository;

public class App {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        ConsolUI ui = new ConsolUI(taskService);
        ui.start();
    }
}

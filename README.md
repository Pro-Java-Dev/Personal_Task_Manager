# Personal Task Manager

A simple command-line task manager written in Java. It lets you create, list,
complete, delete, filter, and sort personal tasks from an interactive console
menu. Tasks are kept in memory only, so they reset each time the program is
restarted.

## Features

- Add a task with a title, description, priority, category, and optional due date
- List all tasks
- Mark a task as completed
- Delete a task by ID
- Filter tasks by priority (`LOW`, `MEDIUM`, `HIGH`)
- Filter tasks by category (e.g. `Work`, `Personal`)
- Show all tasks sorted by due date

## Project structure

```
PERSONAL_TASK_MANAGER/
├── App.java                    # Entry point, wires up the app
├── model/
│   ├── Task.java                # Task entity
│   ├── Priority.java            # LOW / MEDIUM / HIGH enum
│   └── Category.java            # Task category
├── services/
│   └── TaskService.java         # Business logic (add, filter, sort, complete, delete)
├── storage/
│   └── TaskRepository.java      # In-memory storage backed by an ArrayList
└── ui/
    └── ConsolUI.java             # Console menu and user interaction
```

The app follows a simple layered design: `ui` handles console I/O, `services`
holds the task-management logic, `storage` persists tasks in memory, and
`model` defines the core data types.

## Requirements

- JDK 8 or later

## Running the app

From the parent directory of `PERSONAL_TASK_MANAGER` (so the `PERSONAL_TASK_MANAGER`
package folder is visible to the compiler), run:

```bash
javac PERSONAL_TASK_MANAGER/App.java PERSONAL_TASK_MANAGER/model/*.java PERSONAL_TASK_MANAGER/services/*.java PERSONAL_TASK_MANAGER/storage/*.java PERSONAL_TASK_MANAGER/ui/*.java
java PERSONAL_TASK_MANAGER.App
```

## Usage

Once running, choose an option from the menu:

```
===============  The tasks management system ===============
1.Insert new task
2.Show all task
3.Mark task as completed
4.Delete task
5.Filter task based on priority
6.Filter task based on category
7.Show tasks sorted by due date
0.Exit
=============================================================
```

Follow the prompts to enter task details. Dates use the `YYYY-MM-DD` format
and can be left blank if a task has no due date.

## Notes

- Data is not persisted to disk — all tasks are lost on exit.
- Task IDs are assigned automatically and increment for each new task.

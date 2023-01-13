package duke.task;

/**
 * An abstract Task class encapsulating a task in Duke, which can be extended
 * by more specific tasks like Events, toDos, etc.
 */

public abstract class GeneralDukeTask {
    private final String information;
    private final TaskType type;
    private boolean isDone;

    public GeneralDukeTask(String info, TaskType type) {
        this.information = info;
        this.type = type;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    public TaskType getType() {
        return this.type;
    }

    public boolean getStatus() {
        return this.isDone;
    }

    @Override
    public String toString() {
        if (getStatus()) {
            return "[X] " + this.information;
        } else {
            return "[ ] " + this.information;
        }
    }
}

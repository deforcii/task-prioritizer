import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private LocalDate deadline;
    private int importance;

    // Constructors
    public Task() {
    }

    public Task(String title, String description, LocalDate deadline, int importance) {
        setTitle(title);
        setDescription(description);
        setDeadline(deadline);
        setImportance(importance);
    }

    // Setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getImportance() {
        return importance;
    }

    // Importance should only be between 1 and 5 inclusive only!
    public void setImportance(int importance) {
        if (importance <= 0)
            this.importance = 1;
        else if (importance > 5)
            this.importance = 5;
        else
            this.importance = importance;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", importance=" + importance +
                '}';
    }

}
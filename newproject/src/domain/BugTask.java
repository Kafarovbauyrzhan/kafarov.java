package domain;

public class BugTask extends Task {
    private String severity;

    public BugTask(int id, String title, String severity) {
        super(id, title);
        this.severity = severity;
    }
}

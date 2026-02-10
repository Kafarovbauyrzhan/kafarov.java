package domain;

public class FeatureTask extends Task {
    private int priority;

    public FeatureTask(int id, String title, int priority) {
        super(id, title);
        this.priority = priority;
    }
}

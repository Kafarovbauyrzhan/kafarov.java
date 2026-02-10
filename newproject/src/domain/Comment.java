package domain;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private String text;
    private User author;
    private LocalDateTime time;

    public Comment(int id, String text, User author) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.time = LocalDateTime.now();
    }

    public String getText() { return text; }
}

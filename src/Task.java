import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task {
    private String description;
    private boolean isCompleted;
    private LocalDateTime date;

    public Task(String description){
        this.description = description;
        this.isCompleted = false;
        this.date = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted() {
        isCompleted = true;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return date.format(formatter);
    }


    public String toString(){
        return (isCompleted?"[DONE]" + date + " " + description :"[TO-DO] " + date + " " + description);
    }
}

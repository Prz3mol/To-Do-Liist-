import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskMgmt {

private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> complatedTasks = new ArrayList<>();


public void addTask(String description) {
    tasks.add(new Task(description));
}
public void completeTask(int index) {
    if (index < tasks.size() && index >= 0) {
        tasks.get(index).setCompleted();
        complatedTasks.add(tasks.get(index));
        tasks.remove(index);

    } else {
        System.out.println("Invalid task number");
    }
}

public void listTasks() {
    if (tasks.isEmpty()) {
        System.out.println("No tasks found");
    } else {
        System.out.println("================");
        System.out.println("    TASKLIST");
        System.out.println("================");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println( i + 1 + ". " + tasks.get(i));
        }
        System.out.println("================");
        System.out.println("END OF TASKLIST");
        System.out.println("================");
    }
}


    public void listOfComplatedTasks() {
        if (complatedTasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            System.out.println("================");
            System.out.println("    TASKLIST");
            System.out.println("================");
            for (int i = 0; i < complatedTasks.size(); i++) {
                System.out.println( (i + 1)+ ". " + complatedTasks.get(i));
            }
            System.out.println("================");
            System.out.println("END OF TASKLIST");
            System.out.println("================");
        }
    }

}

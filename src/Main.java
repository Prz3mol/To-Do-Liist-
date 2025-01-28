import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskMgmt taskmgr = new TaskMgmt();
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. List of complated tasks");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task description: ");
                    String description = sc.nextLine();
                    taskmgr.addTask(description);
                    break;
                case 2:
                    System.out.println("Enter task number to complate: ");
                    int number = sc.nextInt() - 1;
                    taskmgr.completeTask(number);
                    break;
                case 3:
                    taskmgr.listTasks();
                    break;
                case 4:
                    taskmgr.listOfComplatedTasks();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
        System.out.println("NARA");
    }
}
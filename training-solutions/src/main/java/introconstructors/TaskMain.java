package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Task","Homework");

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        task.start();
        System.out.println(task.getStartDateTime());
        task.setDuration(90);
        System.out.println(task.getDuration());


    }
}

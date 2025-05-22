import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listStacks() {
        for(int i = 0; i < tasks.size(); i++)
            System.out.println(tasks.get(i).toString() + " at idx: " + i);
    }

    public void deleteTask(int idx){
        tasks.remove(idx);
    }
    
    
}

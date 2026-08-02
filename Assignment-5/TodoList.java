import java.util.ArrayList;

public class TodoList
{
    ArrayList<String> tasks;

    TodoList()
    {
        tasks = new ArrayList<String>();
        tasks.add("Complete Java Assignment");
        tasks.add("Prepare for Seminar");
        tasks.add("Buy Groceries");
    }

    void addTask(String task)
    {
        tasks.add(task);
    }

    void removeTask(int index)
    {
        if(index >= 0 && index < tasks.size())
        {
            tasks.remove(index);
        }
    }

    void displayTasks()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("--- TO-DO LIST ---\n");
        for(int i = 0; i < tasks.size(); i++)
        {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] arg)
    {
        TodoList td1 = new TodoList();
        System.out.println("-----------------------------------------------");
        System.out.println("Tasks from Default Constructor:");
        td1.displayTasks();
        System.out.println("-----------------------------------------------");

        TodoList td2 = new TodoList();
        td2.addTask("Submit Project Report");
        td2.addTask("Review Code");
        td2.removeTask(0);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Tasks after Add and Remove operations:");
        td2.displayTasks();
        System.out.println("-----------------------------------------------");
    }
}
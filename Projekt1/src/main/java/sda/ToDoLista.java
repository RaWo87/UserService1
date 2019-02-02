package sda;

import java.time.LocalDate;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;

public class ToDoLista {
    public static void main(String[] args) {
        TDL kalendarz = new TDL();




    }
}

class Task{
String name;
String description;
LocalDate begin;
LocalDate deadline;

public void setDeadline(int days){


}

Task(String name, String desc,int daysTillDone){
    this.name=name;
    this.description=desc;
    this.begin = LocalDate.now();
    this.deadline;
}
public String getName(){
    return  name;
}
public String getDesc(){
    return description;
}

}
class TDL{
    Deque<Task> Lista = new LinkedList<>();
    public void addTask(Task task){
        Lista.add(task);
    }

    public void firstToLast(){
        Task temp = Lista.pollFirst();
        Lista.addLast(temp);
    }
    public Task checkFirst(){
        return Lista.peekFirst();
    }

    public Set<Task> returnALLTasks(){
        Set<Task> tempSet = null;
        tempSet.addAll(Lista);
        return tempSet;
        
    }
}


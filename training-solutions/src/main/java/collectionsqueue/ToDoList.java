package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    public Deque<ToDo> getToDosInUrgencyOrder(List<ToDo> toDoList) {
        Deque<ToDo> doList = new ArrayDeque<>();
        for (ToDo toDo : toDoList) {
            if (toDo.isUrgent()) {
                doList.addFirst(toDo);
            } else {
                doList.addLast(toDo);
            }
        }
        return doList;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        List<ToDo> list = new ArrayList<>();
        list.add(new ToDo("clean the bathroom", false));
        list.add(new ToDo("clean the kitchen", true));
        list.add(new ToDo("water the plants", false));
        list.add(new ToDo("feed the cat", true));
        list.add(new ToDo("feed the dogs", true));

        System.out.println(list);

        System.out.println(toDoList.getToDosInUrgencyOrder(list));
        System.out.println();
        Deque<ToDo> doList = toDoList.getToDosInUrgencyOrder(list);
        System.out.println(doList.pop());
    }
}

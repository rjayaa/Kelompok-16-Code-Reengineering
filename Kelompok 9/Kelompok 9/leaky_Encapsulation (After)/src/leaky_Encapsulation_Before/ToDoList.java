package leaky_Encapsulation_After;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> list;

    public ToDoList() {
        list = new ArrayList<>();
    }

    public List<ToDo> getList() {
        // Return a deep copy of the list
        return new ArrayList<>(list);
    }

    public ToDo getByName(String name) {
        for (ToDo toDo : list) {
            if (toDo.getName().equals(name)) {
                return toDo;
            }
        }

        return null;
    }

    public void add(ToDo t) {
        list.add(t);
    }
}

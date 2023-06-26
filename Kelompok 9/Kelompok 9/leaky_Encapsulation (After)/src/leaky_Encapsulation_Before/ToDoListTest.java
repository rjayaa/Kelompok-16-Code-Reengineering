package leaky_Encapsulation_After;

public class ToDoListTest {
    void test() {
        ToDoList td = new ToDoList();

        td.add(new ToDo("a"));
        assert(td.getByName("a") != null);

        ToDo todo = td.getByName("a");
        if (todo != null) {
            todo.setName("b");
        }

        assert(td.getByName("b") != null);
    }
}

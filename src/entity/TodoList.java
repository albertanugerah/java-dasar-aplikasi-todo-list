package entity;

public class TodoList {
    private String todo;

    public TodoList() {
    }

    public TodoList(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}

//membuat repository untuk db, biasanya khusus layer repository dan service akan buat interface lalu implementasi classnya.

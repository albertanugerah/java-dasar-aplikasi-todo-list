package entity;

public class Todolist {
    private String todo;

    public Todolist() {
    }

    public Todolist(String todo) {
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

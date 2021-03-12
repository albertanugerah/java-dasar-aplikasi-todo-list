package service;

public interface TodoListService {
    //method yang ditambahkan seesuai business logic
    //parameter lihat dari aplikasiTodoList

    void showTodoList();

    void addTodoList(String todo);

    void removeTodoList(Integer number);

}

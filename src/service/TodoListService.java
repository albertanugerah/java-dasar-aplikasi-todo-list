package service;

public interface TodoListService {
    //method yang ditambahkan seesuai business logic
//    dibuat untuk menampilkan data
    //parameter lihat dari aplikasiTodoList

    void showTodoList();

    void addTodoList(String todo);

    void removeTodoList(Integer number);

}

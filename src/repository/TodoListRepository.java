package repository;

import entity.TodoList;

public interface TodoListRepository {
    //method yg ditambahkan seseuai business logic
    //get All data todo list
    TodoList[] getAll();

    //add data to todo list
    void add(TodoList todoList);

    //remove data from todo list
    void remove(Integer number);


}

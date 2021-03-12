package repository;

import entity.Todolist;

public interface TodoListRepository {
    //method yg ditambahkan seseuai business logic
    //get All data todo list
    Todolist[] getAll();

    //add data to todo list
    void add(Todolist todoList);

    //remove data from todo list
    void remove(Integer number);


}

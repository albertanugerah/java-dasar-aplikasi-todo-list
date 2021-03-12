package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

    private Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void add(Todolist todoList) {

    }

    @Override
    public void remove(Integer number) {

    }


//    mengelola data array dilakukan oleh repository
//    butuh repository,karena mengubah impementasi dari array jadi collection/database, cukup mengubah logic yang ada di repository
    // memindahkan  dan mereturn data ke repository, dan juga service nya
}

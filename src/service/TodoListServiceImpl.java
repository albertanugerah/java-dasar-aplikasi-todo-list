package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    //menambahkan attribute dari TodolistRepository
    private TodoListRepository todoListRepository;

    //constructor untuk inject ke repository
    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        // akses array mejadi akses repository
        //model.length diganti mejadi model di repository, buat
        Todolist[] model = todoListRepository.getAll();

        System.out.println("To-Do List");
        //tambahkan ke posisi yang model array nya NUll
        for (int i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;

            //check model
            if (todolist != null) {
                System.out.println(no + ". " + todolist.getTodo());
            }

        }
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);
        System.out.println("SUKSES MENAMBAHKAN TODO : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);

        if (success){
            System.out.println("SUKSES MENGHAPUS TODO " + number);
        }else {
            System.out.println("GAGAL MENGHAPUS TODO " + number);
        }
    }
}

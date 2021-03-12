package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        //Todolist dari repository
        Todolist[] model = todoListRepository.getAll();

        System.out.println("To-Do List");
        //tambahkan ke posisi yang model array nya NUll
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            //check model
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }

        }
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }
}

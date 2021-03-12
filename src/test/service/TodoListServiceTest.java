package test.service;

import entity.Todolist;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {

        testShowTodoLis();
    }

    public static void testShowTodoLis(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar java dasar");
        todoListRepository.data[1] = new Todolist("Belajar java OOP");
        todoListRepository.data[2] = new Todolist("Belajar java Standard Classes");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }
}

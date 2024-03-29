package com.example.todo.Service;

import com.example.todo.Models.TodoModel;
import com.example.todo.Repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private ITodoRepository repository;

    public Iterable<TodoModel> list() {
        return repository.findAll();
    }

    public TodoModel save(TodoModel todoModel) {
        return repository.save(todoModel);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public TodoModel get(Long id) {
        return repository.findById(id).orElseThrow();
    }
}

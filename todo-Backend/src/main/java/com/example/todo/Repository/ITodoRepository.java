package com.example.todo.Repository;

import com.example.todo.Models.TodoModel;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<TodoModel, Long>{

}

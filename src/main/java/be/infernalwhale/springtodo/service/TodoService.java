package be.infernalwhale.springtodo.service;

import be.infernalwhale.springtodo.model.Todo;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TodoService {
    Todo createTodo(Todo todo) throws SQLException;
    Todo updateTodo(Todo todo) throws SQLException;
    Todo deleteTodo(Todo todo);
    List<Todo> getAllTodos();
    List<Todo> getTodoByUser(String user);
    Optional<Todo> getTodoById(int id);
}
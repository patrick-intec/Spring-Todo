package be.infernalwhale.springtodo.service;

import be.infernalwhale.springtodo.data.TodoDAO;
import be.infernalwhale.springtodo.model.Todo;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    private TodoDAO dao;

    public TodoServiceImpl(TodoDAO dao) {
        this.setDao(dao);
    }

    public void setDao(TodoDAO dao) {
        this.dao = dao;
    }

    @Override
    public Todo createTodo(Todo todo) throws SQLException {
        // save a new todo to the db
        return this.dao.saveTodo(todo);
    }

    @Override
    public Todo updateTodo(Todo todo) throws SQLException {
        return this.dao.saveTodo(todo);
    }

    @Override
    public Todo deleteTodo(Todo todo) {
        return this.dao.deleteTodo(todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        // Solution: If it doesn't exist... WRITE IT!!!
        return this.dao.getAll();
    }

    @Override
    public List<Todo> getTodoByUser(String user) {
        return this.dao.getTodoByUser(user);
    }

    @Override
    public Optional<Todo> getTodoById(int id) {
        return this.dao.getTodo(id);
    }
}

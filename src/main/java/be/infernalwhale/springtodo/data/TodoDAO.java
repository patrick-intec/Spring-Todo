package be.infernalwhale.springtodo.data;

import be.infernalwhale.springtodo.model.Todo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TodoDAO {
    // Copy-Pasta
    Todo saveTodo(Todo todo) throws SQLException;
    Todo deleteTodo(Todo todo);
    Optional<Todo> getTodo(int id);
    List<Todo> getTodoByUser(String user);
    List<Todo> getAll();

}

package be.infernalwhale.springtodo.data;

import be.infernalwhale.springtodo.model.Todo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

@Component
public class JDBCTodoDAO implements TodoDAO {
    private final String INSERT = "INSERT INTO todo (message, user) VALUES (%s, %s)";
    // IMMUTABILITY

    private Connection connection;

    public JDBCTodoDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Todo saveTodo(Todo todo) throws SQLException {
        Statement statement = this.connection.createStatement();

        String sql = String.format(INSERT, "this is the message", "username");
        return todo;
    }

    @Override
    public Todo deleteTodo(Todo todo) {
        return null;
    }

    @Override
    public Optional<Todo> getTodo(int id) {
        return Optional.empty();
    }

    @Override
    public List<Todo> getTodoByUser(String user) {
        return null;
    }

    @Override
    public List<Todo> getAll() {
        return null;
    }
}

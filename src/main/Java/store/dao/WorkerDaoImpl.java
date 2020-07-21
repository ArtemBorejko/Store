package store.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import store.entities.Worker;

import java.util.List;

public class WorkerDaoImpl implements WorkerDao {
    public final JdbcTemplate jdbcTemplate;

    public WorkerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Worker worker) {
        String sql = "INSERT INTO workers() VALUES";

    }

    public Worker getById(int idOfWorker) {
        return null;
    }

    public List<Worker> findAll() {
        return null;
    }

    public void update(Worker worker) {

    }

    public void delete(int idOfWorker) {

    }
}

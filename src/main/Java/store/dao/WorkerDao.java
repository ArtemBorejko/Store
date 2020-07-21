package store.dao;

import store.entities.Worker;

import java.util.List;

public interface WorkerDao {
    void save(Worker worker);

    Worker getById(int idOfWorker);

    List<Worker> findAll();

    void update(Worker worker);

    void delete(int idOfWorker);
}

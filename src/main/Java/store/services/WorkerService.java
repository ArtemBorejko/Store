package store.services;

import store.entities.Worker;
import java.util.List;

public interface WorkerService {

    List<Worker> findAll();

    Worker save(Worker worker);

    Worker update(Worker worker);

    void delete(int idOfWorker);

    Worker getById(int idOfWorker);
}

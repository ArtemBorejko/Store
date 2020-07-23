package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    Worker getByIdOfWorker(int idOfWorker);
}

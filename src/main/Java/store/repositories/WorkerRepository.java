package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import store.entities.Worker;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

}

package store.services.implementations;

import org.springframework.stereotype.Service;
import store.entities.Worker;
import store.repositories.WorkerRepository;
import store.services.WorkerService;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    private WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @Override
    public Worker save(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public Worker update(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public void delete(int idOfWorker) {
        workerRepository.deleteById(idOfWorker);
    }

    @Override
    public Worker getById(int idOfWorker) {
        return workerRepository.getOne(idOfWorker);
    }
}

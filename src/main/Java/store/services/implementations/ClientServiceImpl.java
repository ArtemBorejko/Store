package store.services.implementations;

import org.springframework.stereotype.Service;
import store.entities.Client;
import store.repositories.ClientRepository;
import store.services.ClientService;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    public void delete(int idOfClient) {
        clientRepository.deleteById(idOfClient);
    }

    public Client getById(int idOfClient) {
        return clientRepository.getByIdOfClient(idOfClient);
    }

}

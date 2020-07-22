package store.services;

import store.entities.Client;
import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client save(Client client);

    Client update(Client client);

    void delete(int idOfClient);

    Client getById(int idOfClient);
}

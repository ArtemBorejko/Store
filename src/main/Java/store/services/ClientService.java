package store.services;

import store.entities.Client;


import java.util.List;

public interface ClientService {
    List<Client> findAll();

    void save(Client client);

    void update(Client client);

    void delete(int idOfClient);

    Client getById(int idOfClient);
}

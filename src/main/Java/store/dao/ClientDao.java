package store.dao;

import store.entities.Client;

import java.util.List;

public interface ClientDao {

    void save(Client client);

    Client getById(int idOfClient);

    List<Client> findAll();

    void update(Client client);

    void delete(int idOfClient);
}

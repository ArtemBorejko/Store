package store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.dao.ClientDao;
import store.entities.Client;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    public ClientDao clientDao;


    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public void save(Client client) {
        clientDao.save(client);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(int idOfClient) {
        clientDao.delete(idOfClient);
    }

    public Client getById(int idOfClient) {
        return clientDao.getById(idOfClient);
    }

}

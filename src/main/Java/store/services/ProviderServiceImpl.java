package store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.dao.ProviderDao;
import store.entities.Provider;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    public ProviderDao providerDao;

    public void save(Provider provider){
        providerDao.save(provider);
    }

    public List<Provider> findAll() {
        return providerDao.findAll();
    }

    public Provider getById(int idOfProvider){
        return providerDao.getById(idOfProvider);
    }

    public void update(Provider provider){
        providerDao.update(provider);
    }

    public void delete(int idOfProvider){
        providerDao.delete(idOfProvider);
    }
}

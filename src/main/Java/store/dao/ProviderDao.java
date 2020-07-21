package store.dao;

import store.entities.Provider;

import java.util.List;

public interface ProviderDao {
    void save(Provider provider);

    Provider getById(int idOfProvider);

    List<Provider> findAll();

    void update(Provider provider);

    void delete(int idOfProvider);
}

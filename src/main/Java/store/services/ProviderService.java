package store.services;

import store.entities.Provider;

import java.util.List;

public interface ProviderService {

    List<Provider> findAll();

    Provider save(Provider provider);

    Provider update(Provider provider);

    void delete(int idOfProvider);

    Provider getById(int idOfProvider);
}

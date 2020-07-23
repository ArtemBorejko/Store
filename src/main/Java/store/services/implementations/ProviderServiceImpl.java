package store.services.implementations;

import org.springframework.stereotype.Service;
import store.entities.Provider;
import store.repositories.ProviderRepository;
import store.services.ProviderService;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    private ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Provider save(Provider provider){
        return providerRepository.save(provider);
    }

    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    public Provider getById(int idOfProvider){
        return providerRepository.getByIdOfProvider(idOfProvider);
    }

    public Provider update(Provider provider){
        return providerRepository.saveAndFlush(provider);
    }

    public void delete(int idOfProvider){
        providerRepository.deleteById(idOfProvider);
    }
}

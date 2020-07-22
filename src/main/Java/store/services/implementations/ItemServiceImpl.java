package store.services.implementations;

import org.springframework.stereotype.Service;
import store.entities.Item;
import store.repositories.ItemRepository;
import store.services.ItemService;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
        private ItemRepository itemRepository;


    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item save(Item item){
        return itemRepository.save(item);
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item getById(int idOfProvider){
        return itemRepository.getOne(idOfProvider);
    }

    public Item update(Item item){
        return itemRepository.saveAndFlush(item);
    }

    public void delete(int idOfProvider){
        itemRepository.deleteById(idOfProvider);
    }
}

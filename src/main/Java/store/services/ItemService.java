package store.services;


import store.entities.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();

    Item save(Item item);

    Item update(Item item);

    void delete(int idOfItem);

    Item getById(int idOfItem);
}

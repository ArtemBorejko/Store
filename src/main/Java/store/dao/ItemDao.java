package store.dao;

import store.entities.Item;

import java.util.List;

public interface ItemDao {
    void save(Item item);

    Item getById(int idOfItem);

    List<Item> findAll();

    void update(Item item);

    void delete(int idOfItem);
}

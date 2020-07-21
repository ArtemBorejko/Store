package store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import store.entities.Item;
import store.mappers.ItemMapper;

import java.util.List;

public class ItemDaoImpl implements ItemDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public ItemDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Item item) {
        String sql = "INSERT INTO items(name, listOfCon, charac, price, numOfPar, number) VALUES (?, ?, ?, ? ,?)";
        jdbcTemplate.update(sql, item.getName(), item.getListOfCon(), item.getCharac(), item.getPrice(), item.getNumOfPar(), item.getNumber());
    }

    public Item getById(int idOfItem) {
        String sql = "SELECT * FROM clients WHERE idOfItem=?";
        return jdbcTemplate.queryForObject(sql, new ItemMapper(), idOfItem);
    }

    public List<Item> findAll() {
        String sql = "SELECT * FROM items";
        return jdbcTemplate.query(sql, new ItemMapper());
    }

    public void update(Item item) {

    }

    public void delete(int idOfItem) {

    }
}

package store.mappers;

import org.springframework.jdbc.core.RowMapper;
import store.entities.Item;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<Item> {
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item();
        item.setIdOfItem(rs.getInt("idOfItem"));
        item.setName(rs.getString("name"));
        item.setListOfCon(rs.getString("listOfCon"));
        item.setCharac(rs.getString("charac"));
        item.setPrice(rs.getInt("price"));
        item.setNumOfPar(rs.getInt("numOfPar"));
        item.setNumber(rs.getInt("number"));

        return item;
    }
}

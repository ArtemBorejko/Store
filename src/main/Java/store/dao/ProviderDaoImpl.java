package store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import store.entities.Provider;
import store.mappers.ProviderMapper;

import java.util.List;

public class ProviderDaoImpl implements ProviderDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProviderDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Provider provider) {
        String sql = "INSERT INTO providers (name, address, typeOfItem, phone, fullname) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, provider.getIdOfProvider(), provider.getName(), provider.getAddress(), provider.getTypeOfItem(), provider.getPhone(), provider.getFullname());
    }


    public Provider getById(int idOfProvider) {
        String sql = "SELECT * FROM providers WHERE idOfProvider=?";
        return jdbcTemplate.queryForObject(sql, new ProviderMapper(), idOfProvider);
    }


    public List<Provider> findAll() {
       String sql = "SELECT * FROM providers";
       return jdbcTemplate.query(sql , new ProviderMapper());
    }


    public void update(Provider provider) {
        String sql = "UPDATE providers SET name=?, address=?, typeOfItem=?, phone=?, fullname=?";
        jdbcTemplate.update(sql,provider.getIdOfProvider(), provider.getName(), provider.getAddress(), provider.getTypeOfItem(), provider.getPhone(), provider.getFullname());
    }


    public void delete(int idOfProvider) {
        String sql = "DELETE FROM providers WHERE idOfProvider=?";
        jdbcTemplate.update(sql, idOfProvider);
    }
}

package store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import store.entities.Client;
import store.mappers.ClientMapper;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Client client) {
        String sql = "INSERT INTO clients(fullname, email, phone, address, dateOfBirth) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, client.getIdOfClient(), client.getFullname(), client.getPhone(), client.getAddress(), client.getDateOfBirth());
    }

    public Client getById(int idOfClient) {
        String sql = "SELECT * FROM clients WHERE idOfClient=?";
        return jdbcTemplate.queryForObject(sql, new ClientMapper(), idOfClient);
    }

    public List<Client> findAll() {
        String sql = "SELECT * FROM clients";
        return jdbcTemplate.query(sql , new ClientMapper());
    }

    public void update(Client client) {
        String sql = "UPDATE clients SET fullname=?, email=?, phone=?, address=?, dateOfBirth=?";
        jdbcTemplate.update(sql, client.getIdOfClient(), client.getFullname(), client.getEmail(), client.getPhone(), client.getAddress(), client.getDateOfBirth());
    }

    public void delete(int idOfClient) {
        String sql = "DELETE  FROM clients WHERE idOfClient=?";
        jdbcTemplate.update(sql, idOfClient);
    }
}

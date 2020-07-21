package store.mappers;

import org.springframework.jdbc.core.RowMapper;
import store.entities.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client> {

    public Client mapRow(ResultSet rs, int i) throws SQLException {
        Client client = new Client();
        client.setIdOfClient(rs.getInt("idOfClient"));
        client.setFullname(rs.getString("fullname"));
        client.setEmail(rs.getString("email"));
        client.setAddress(rs.getString("address"));
        client.setDateOfBirth(rs.getDate("dateOfBirth"));

        return client;
    }
}

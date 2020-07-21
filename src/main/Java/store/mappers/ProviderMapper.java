package store.mappers;

import org.springframework.jdbc.core.RowMapper;
import store.entities.Provider;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProviderMapper implements RowMapper<Provider> {

    public Provider mapRow(ResultSet rs, int i) throws SQLException {
        Provider provider = new Provider();
        provider.setIdOfProvider(rs.getInt("idOfProvider"));
        provider.setName(rs.getString("name"));
        provider.setAddress(rs.getString("address"));
        provider.setTypeOfItem(rs.getString("typeOfItem"));
        provider.setPhone(rs.getString("phone"));
        provider.setFullname(rs.getString("fullname"));

        return provider;
    }
}

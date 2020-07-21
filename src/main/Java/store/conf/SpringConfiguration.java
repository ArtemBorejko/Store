package store.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import store.dao.*;

import javax.sql.DataSource;

@Configuration
public class SpringConfiguration {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://${MYSQL_HOST:localhost}:3306/store?serverTimezone=UTC");
        dataSource.setUsername("artemiy");
        dataSource.setPassword("Recognize13_");

        return dataSource;
    }

    @Bean
    public ProviderDao getProviderDao(){
        return new ProviderDaoImpl(getJdbcTemplate());
    }

    @Bean
    public ClientDao getClientDao(){
        return new ClientDaoImpl(getJdbcTemplate());
    }

    @Bean
    public WorkerDao getWorkerDao(){
        return new WorkerDaoImpl(getJdbcTemplate());
    }

    @Bean
    public OrderDao getOrderDao(){
        return new OrderDaoImpl(getJdbcTemplate());
    }

    @Bean
    public ItemDao getItemDao(){
        return new ItemDaoImpl(getJdbcTemplate());
    }
}

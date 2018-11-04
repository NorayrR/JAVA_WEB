package norayr.config;


import norayr.dao.UserDao;
import norayr.dao.UserDaoimpl;
import norayr.service.UserService;
import norayr.service.UserServiceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/webapp?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return  dataSource;
    }

    @Bean
     public UserDao getUserDao(){
        return new UserDaoimpl(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService(){
        return new UserServiceimpl();
    }
}

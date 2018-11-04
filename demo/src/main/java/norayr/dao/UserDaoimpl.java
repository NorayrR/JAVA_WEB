package norayr.dao;

import norayr.entity.User;
import norayr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoimpl implements UserDao{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoimpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }



    //@Override
    public List<User> findAll() {
        String sql="SELECT * FROM user";
        return jdbcTemplate.query(sql,new UserMapper());
    }
}

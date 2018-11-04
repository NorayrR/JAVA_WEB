package norayr.dao;

import norayr.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}

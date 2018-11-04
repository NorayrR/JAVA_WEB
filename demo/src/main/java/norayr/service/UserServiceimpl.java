package norayr.service;

import norayr.dao.UserDao;
import norayr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    public UserDao userDao;
    //@Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}

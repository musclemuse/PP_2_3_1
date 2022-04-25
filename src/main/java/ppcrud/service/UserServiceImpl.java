package ppcrud.service;

import ppcrud.dao.UserDao;
import ppcrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;



    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void removeUserById(long id) {

    }

    @Transactional
    @Override
    public void update(User user) {
    userDao.update(user);
    }

    @Override
    @javax.transaction.Transactional
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    @Override
    public List<User> listOfAllUsers() {
        return userDao.listOfAllUsers();
    }
}

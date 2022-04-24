package ppcrud.service;

import ppcrud.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void removeUserById (long id);
    void update (User user);

    List<User> listOfAllUsers();
}

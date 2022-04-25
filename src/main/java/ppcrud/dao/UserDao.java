package ppcrud.dao;

import ppcrud.model.User;

import java.util.List;

public interface UserDao {
       void add(User user);
        void removeUserById (long id);
        void update (User user);

        List<User> listOfAllUsers();

   public User getUserById(long id);
}

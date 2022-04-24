package ppcrud.dao;

import org.springframework.stereotype.Component;
import ppcrud.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl() {
    }

    @Override
    public List<User> listOfAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();

    }

//    @Override
//    public void add(User user) {
//        entityManager.persist(user);
//    }

//    @Override
//    public void removeUserById(long id) {
//        Session session = entityManager.getCurrentSession();
//        session.get(User.class, id);
//    }

//    @Override
//    public void update(User user) {
//        Session session = entityManager.getCurrentSession();
//        session.update(user);
//    }


}

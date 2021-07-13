package by.dmitry.kovalenko.service;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    public List<User> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM User");
        List<User> list = query.list();

        transaction.commit();
        return list;
    }
}

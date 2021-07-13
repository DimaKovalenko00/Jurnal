package by.dmitry.kovalenko.dao;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.Student;
import by.dmitry.kovalenko.model.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 03.06.2019.
 */
@Repository
public class UserDao {

    public Student findById(int id) {

        return HibernateUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public User byName(String login ) {

        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM User s where s.login=:login");
        query.setParameter("login",login);
        User  user = (User)query.uniqueResult();
        transaction.commit();
        return user;
    }

}

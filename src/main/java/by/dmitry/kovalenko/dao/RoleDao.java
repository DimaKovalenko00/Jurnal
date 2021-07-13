package by.dmitry.kovalenko.dao;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.Role;
import by.dmitry.kovalenko.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 03.06.2019.
 */
@Repository
public class RoleDao {

    public Student findById(int id) {

        return HibernateUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public List<Role> byUserId(int login ) {

        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Role s where s.user.user_id=:login");
        query.setParameter("login",login);
        List<Role> list = query.list();
        transaction.commit();
        return list;
    }

}

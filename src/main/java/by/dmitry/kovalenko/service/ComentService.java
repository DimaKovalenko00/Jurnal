package by.dmitry.kovalenko.service;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.dao.StudentDao;
import by.dmitry.kovalenko.model.entity.Coment;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComentService {
    private StudentDao studentDao = new StudentDao();

    public List<Coment> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Coment ");
        List<Coment> list = query.list();
        transaction.commit();
        return list;
    }

    public void save(Coment coment ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(coment);
        tx1.commit();
        session.close();
    }


}

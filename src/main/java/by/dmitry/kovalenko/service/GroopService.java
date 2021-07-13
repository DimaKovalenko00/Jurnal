package by.dmitry.kovalenko.service;


import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.Groop;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroopService {

    public List<Groop> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Groop ");
        List<Groop> list = query.list();

        transaction.commit();
        return list;
    }
    public void save(Groop groop ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(groop);
        tx1.commit();
        session.close();
    }

    public List<Groop> findFilterParametrs(String nomer) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Groop g where g.nomer_groop Like:nomer");
        query.setParameter("nomer","%"+nomer+"%");
        List<Groop> list = query.list();
        transaction.commit();
        return list;
    }
    public void delete(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Student s where s.groop.groop_id=:id");
        query.setParameter("id",id);
        List<Groop> list = query.list();

        if (list!=null)
        {
            for (int i =0;i<list.size();i++) {
                session.delete(list.get(i));
            }
        }

        session.delete(session.get(Groop.class, id));
        transaction.commit();
        session.close();
    }

    public Groop findById(String id) {
        int num=Integer.parseInt(id) ;
        return HibernateUtil.getSessionFactory().openSession().get(Groop.class , num);
    }
    }



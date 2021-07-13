/**package by.animal.kovalenko.dao;

/**
 * Created by user on 20.03.2019.
 */
/**
import by.animal.kovalenko.model.entity.Hangar;
import by.animal.kovalenko.model.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static by.animal.kovalenko.configuration.HibernateSessionFactoryUtil.getSessionFactory;
import static by.animal.kovalenko.model.HibernateSessionFactoryUtil.getSessionFactory;

public class HangarDao {
    private Session currentSession;

    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }



    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }
    public Hangar findById(String id) {
        Hangar hangar = (Hangar) getCurrentSession().get(Hangar.class, id);
        return hangar;
    }
    //public Hangar findById(int id) {
      //  return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Hangar.class, id);
    //}
    public void save(Hangar entity) {
        getCurrentSession().save(entity);
    }
    /**public void save(Hangar hangar) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(hangar);
        tx1.commit();
        session.close();
    }**//**
    public void update(Hangar entity) {
        getCurrentSession().update(entity);
    }
    /**public void update(Hangar hangar) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(hangar);
        tx1.commit();
        session.close();
    }**//**
    public void delete(Hangar entity) {
        getCurrentSession().delete(entity);
    }
    /**
  public void delete(Hangar hangar) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(hangar);
        tx1.commit();
        session.close();
    }**//**

    public Product findProductById(int id) {
        return getSessionFactory().openSession().get(Product.class, id);
    }
    public List<Hangar> findAll() {
        List<Hangar> hangars= (List<Hangar>)  getSessionFactory().openSession().createQuery("FROM Hangar").list();
        return hangars;
    }
    /**
    public List<Hangar> findAll() {
        List<Hangar> hangars = (List<Hangar>) getCurrentSession().createQuery("from Hangar").list();
        return hangars;
    }

    public void updateQuantity(int quantity,int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Hangar hangar = new Hangar();
        hangar.setHangar_id(id);
        hangar.setQuantity(quantity);
        session.update(hangar);
        tx1.commit();
        session.close();
    }**/
    /**
}**/
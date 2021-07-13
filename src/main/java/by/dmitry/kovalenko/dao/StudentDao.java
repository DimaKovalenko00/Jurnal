package by.dmitry.kovalenko.dao;


import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentDao {

    @Autowired
    private Session session;

 public Student findById(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public void save(Student student ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    public void update(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }

    public Student findProductById(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public List<Student> findAll() {
        List<Student> students= (List<Student>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Student").list();
        return students;
    }

}

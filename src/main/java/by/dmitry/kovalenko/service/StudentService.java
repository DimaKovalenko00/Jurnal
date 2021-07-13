package by.dmitry.kovalenko.service;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.dao.StudentDao;
import by.dmitry.kovalenko.model.entity.MedCarta;
import by.dmitry.kovalenko.model.entity.MilCarta;
import by.dmitry.kovalenko.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    private StudentDao studentDao = new StudentDao();


 /*   public Student findProduct(int id) {
        return studentDao.findById(id);
    }

    public void saveProduct(Student student) {
        studentDao.save(student);
    }

    public void deleteo(Student student) {
        studentDao.delete(student);
    }

    public void updateProduct(Student student) {
        studentDao.update(student);
    }

    public List<Student> findAllProducts() {
        return studentDao.findAll();
    }

    public Student findProductById(int id) {
        return studentDao.findProductById(id);
    }
*/
    public List<Student> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Student ");
        List<Student> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public Student findById(String num) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        int id = Integer.parseInt(num);
        Student student=(Student)session.get(Student.class, id);
        transaction.commit();
        session.close();
        return student;

    }
/*
    public MilCarta findAllByIdM(String id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM MilCarta m where m.student.student_id=:id");
        query.setParameter("id",id);
    MilCarta milCarta = (MilCarta) query.uniqueResult();
        transaction.commit();
        return milCarta;

    }
    public MedCarta findAllByIdMe(String id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM MedCarta c where c.student.student_id=:id");
        query.setParameter("id", id);
        MedCarta medCarta = (MedCarta) query.uniqueResult();
        transaction.commit();
        return medCarta;
    }
*/
    public List<Student> findFilterParametrs(String surname,String name,String groop) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Student s where (s.f Like:surname) and (s.i Like:name) ");
        query.setParameter("surname",surname+"%");
        query.setParameter("name",name+"%");
      //  query.setParameter("groop",groop);
        List<Student> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }
    public void delete(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("FROM MilCarta m where m.student.student_id=:id");
            query.setParameter("id",id);
            MilCarta milCarta = (MilCarta) query.uniqueResult();
            Student student=(Student)session.get(Student.class, id);
            query = session.createQuery("FROM MedCarta c where c.student.student_id=:id");
            query.setParameter("id",id);
            MedCarta medCarta = (MedCarta) query.uniqueResult();
        if (milCarta!=null)
        {
            session.delete(milCarta);
        }
        if (milCarta!=null)
        {
            session.delete(medCarta);
        }
        if (student.getPredmetUspevaimost()!=null)
        {
            session.delete(student.getPredmetUspevaimost());
        }
        session.delete(student);
        transaction.commit();
        session.close();
    }
    public void save(Student student ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

/*
    public List<Student> findAllInfo() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT g FROM Student s " +
                "JOIN Student s ON u.groop_id = s.predmetUspevaimost.predmet_usp_id");

        List<Student> list = query.list();

        transaction.commit();
        return list;
    }
*/




}

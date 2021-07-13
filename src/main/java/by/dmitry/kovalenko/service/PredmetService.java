package by.dmitry.kovalenko.service;

import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.NazvPredmeta;
import by.dmitry.kovalenko.model.entity.OtmetkaPoPredmetu;
import by.dmitry.kovalenko.model.entity.Predmet;
import by.dmitry.kovalenko.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PredmetService {

    public List<NazvPredmeta> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM NazvPredmeta  ");
        List<NazvPredmeta> list = query.list();

        transaction.commit();
        return list;
    }
    public List<OtmetkaPoPredmetu> findId(String num) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        int id=Integer.parseInt(num);
        Query query = session.createQuery("FROM OtmetkaPoPredmetu as o where o.predmet.nazvPredmeta.nazv_predmeta_id =:id");
        query.setParameter("id",id);
        List<OtmetkaPoPredmetu> list = query.list();

        transaction.commit();
        return list;
    }
    public Predmet findByIdStudent(String num, String nazv){
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        int id=Integer.parseInt(num);
        Student student=(Student)session.get(Student.class, id);
        int predmetUspId = student.getPredmetUspevaimost().getPredmet_usp_id();
        int idNazv =Integer.parseInt(nazv);
        Query query = session.createQuery("FROM Predmet as p where (p.predmetUspevaimost.predmet_usp_id=:id) and (p.nazvPredmeta.nazv_predmeta_id=:nazv)");
        query.setParameter("id",predmetUspId);
        query.setParameter("nazv",idNazv);
        Predmet predmet =(Predmet)query.uniqueResult();
        transaction.commit();
        return predmet;
    }
    public void saveOt(OtmetkaPoPredmetu otmetka ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(otmetka);
        tx1.commit();
        session.close();
    }

    public List<Student> findAllStudents() {
//        Session session = HibernateUtil.getSession();
//        Transaction transaction = session.beginTransaction();
//
//        Query query = session.createQuery("SELECT s FROM PredmetUspevaimost u " +
//                "JOIN Student s ON u.predmet_usp_id = s.predmetUspevaimost.predmet_usp_id");
//        List<Student> list = query.list();
//
//        transaction.commit();
//        return list;
        return null;
    }



}

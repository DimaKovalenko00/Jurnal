package by.dmitry.kovalenko.service;


import by.dmitry.kovalenko.configuration.HibernateUtil;
import by.dmitry.kovalenko.model.entity.Otdel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OtdelService {

    public List<Otdel> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Otdel ");
        List<Otdel> list = query.list();

        transaction.commit();
        return list;
    }
    public Otdel findByIdOtdela(String id) {
        int num=Integer.parseInt(id) ;
        return HibernateUtil.getSessionFactory().openSession().get(Otdel.class , num);
    }

//        @Autowired
//        private JdbcTemplate jdbcTemplate;
//
//public List<Groop> getGroop() {
//            String sql = "SELECT * FROM groop";
//
//            List<Groop> groops = new ArrayList<>();
//
//            List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
//            for (Map row : rows) {
//                Otdel otdel = new Otdel();
//                otdel.setOtdel_id((int)row.get("otdel_id"));
//
//                Groop groop = new Groop();
//                groop.setGroop_id((int)row.get("groop_id"));
//                groop.setNomer_groop((int)row.get("nomer_groop"));
//                groop.setGod_postup((int)row.get("god_postup"));
//                groop.setOtdel(otdel);
//
//                groops.add(groop);
//            }
//            return groops;
//        }
//
//
//        public void addGroop(String nomerGroop , String godPostup,String otdelId){
//            String sql ="INSERT INTO  groop VALUE (0,"+nomerGroop+","+godPostup+","+otdelId+");";
//            jdbcTemplate.update(sql);
//        }
//        public void delGroop(int id){
//            String sql ="DELETE FROM groop WHERE groop_id="+id+";";
//
//            jdbcTemplate.execute(sql);
//        }
    }



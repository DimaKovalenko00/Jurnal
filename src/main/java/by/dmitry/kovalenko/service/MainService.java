package by.dmitry.kovalenko.service;

import org.springframework.stereotype.Service;

/**
 * Created by user on 15.03.2019.
 */
@Service
public class MainService {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    private StudentService studentService;
//
//    public List<User> getUsers() {
//        String sql = "SELECT user_id, login, password, dostup FROM user";
//
//        List<User> users = new ArrayList<>();
//
//        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
//        for (Map row : rows) {
//            User user = new User();
//            user.setLogin((String) row.get("login"));
//            user.setPassword((String) row.get("password"));
//            user.setDostup((int) row.get("dostup"));
//
//            users.add(user);
//        }
//        return users;
//    }
//    public Integer check(String log,String password){
//        String sql = "SELECT user_id, login, password, dostup FROM user WHERE login="+log;
//        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
//        for (Map row : rows)
//            if ((String) row.get("password") == password) {
//                return ( (int) row.get("dostup"));
//
//            }
//        return (null);
//    }

}

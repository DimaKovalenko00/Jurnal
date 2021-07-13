package by.dmitry.kovalenko.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by user on 16.05.2019.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }

    public static Session getSession() {
        Session session = sessionFactory.openSession();
        return session;
    }
}

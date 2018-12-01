package cn.itcast.untils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateUntils {
	    static Configuration cfg = null;
	    static SessionFactory sessionFactory = null;
	    
	    static {
	    	 cfg = new Configuration();
	    	 cfg.configure();
	    	 sessionFactory = cfg.buildSessionFactory();
	    }
	    public static Session getSessionobjecty() {
	    	System.out.println("sessionFactory:/t"+sessionFactory.getCurrentSession());
	    	return sessionFactory.getCurrentSession();
	    }
	    @Test
		public static SessionFactory getSessionFactory() {
	    	 System.out.println(10);
	    	return sessionFactory;
		}
		
		
}

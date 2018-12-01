package cn.itcast.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.Test;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import cn.itcast.entity.Messages;
 
public class MessagesDaoImpl implements MessagesDao {
	 private HibernateTemplate  hibernateTemplate;

		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
	   

	
	public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}



	public void add(Messages messages) {
	
		  this.hibernateTemplate.save(messages);
	}



	
	public List<Messages> findall() {
		
		Session session= hibernateTemplate.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Messages.class);
	    List<Messages> messagesList = criteria.list();
		return 	messagesList;	 		
		
	}

	


	
	public List<Messages> findByusername(String username) {
		Session session= hibernateTemplate.getSessionFactory().getCurrentSession();
		String hql = "from Messages m where m.username=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		List<Messages> messagesList = 
	        (List<Messages>) query.list();
		System.out.println("第二次的username"+username);
	
		
		return messagesList;
	}




	public void delById(Integer mid) {
		
		hibernateTemplate.delete(hibernateTemplate.get(Messages.class, mid)); 
	}



	
	public void update(Messages messages) {
		this.hibernateTemplate.saveOrUpdate(messages);
		
	}



	
	public List<Messages> findByid(Integer mid) {
		List<Messages> messages =   (List<Messages>) this.getHibernateTemplate().find("from Messages t where t.mid=?", mid);
		return messages;
	}



	




	
	
	
}

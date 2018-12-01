package cn.itcast.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;


import cn.itcast.entity.User;

public class UserDaoImpl  implements UserDao {
    private HibernateTemplate  hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
   

	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
		
	}

	
	public User findUser(User user) {
		User firstuser = new User();
		//HQL��ѯ���
		String hql = "from User user where user.username='"
				+ user.getUsername() + "' and user.password= '"
				+ user.getPassword() + "'";
		//����ѯ���Ľ���ŵ�List
		List<User> userlist = (List<User>) hibernateTemplate.find(hql);
		//�ж��Ƿ��в�ѯ��������仰˵�����ж��û��Ƿ����
		if(userlist!=null && userlist.size()>0){
		//ȡ����ѯ����ĵ�һ��ֵ�����������ݿ���û���ظ����û���Ϣ
		firstuser = userlist.get(0);
		}
		return firstuser;
		/*
		 * 
		 * 
		String hql1 = "from User  where username=:username and password=:password";
	    Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql1);
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		List<User> list = query.list();      */
	}
    

	

	
	

}

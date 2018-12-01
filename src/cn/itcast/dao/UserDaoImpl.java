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
		//HQL查询语句
		String hql = "from User user where user.username='"
				+ user.getUsername() + "' and user.password= '"
				+ user.getPassword() + "'";
		//将查询出的结果放到List
		List<User> userlist = (List<User>) hibernateTemplate.find(hql);
		//判断是否有查询结果，换句话说就是判断用户是否存在
		if(userlist!=null && userlist.size()>0){
		//取出查询结果的第一个值，理论上数据库是没有重复的用户信息
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

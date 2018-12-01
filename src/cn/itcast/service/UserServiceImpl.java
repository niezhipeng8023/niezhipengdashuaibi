package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.entity.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void saveUser(User user) {
	   userDao.saveUser(user);
		
	}

	
	public boolean findUser(User user) {
		User firstuser = userDao.findUser(user);
		//在UserDAO查询中已经判断了只有当用户名和密码都存在时才返回firstuser
		//所以在这里只用判断firstuser里面用户名或者密码中的一个是否存在就可以了
		if(firstuser.getUsername()!=null){
			return true;
		}else{
			return false;
		}
	}



}

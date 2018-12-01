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
		//��UserDAO��ѯ���Ѿ��ж���ֻ�е��û��������붼����ʱ�ŷ���firstuser
		//����������ֻ���ж�firstuser�����û������������е�һ���Ƿ���ھͿ�����
		if(firstuser.getUsername()!=null){
			return true;
		}else{
			return false;
		}
	}



}

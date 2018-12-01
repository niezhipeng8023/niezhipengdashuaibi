package cn.itcast.dao;

import cn.itcast.entity.User;

public interface UserDao {
	
	
    public void saveUser(User user);
	
	public User findUser(User user);

}

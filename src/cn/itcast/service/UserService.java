package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.entity.User;

@Transactional
public interface UserService {
	
	    public void saveUser(User user);  
     
	    public boolean findUser(User user);  
}

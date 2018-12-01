package cn.itcast.dao;

import java.util.List;



import cn.itcast.entity.Messages;

public interface MessagesDao {
	
	public void add(Messages messages);
	public List<Messages> findall();
	public List<Messages> findByusername(String username);
	public void delById(Integer mid); 
	public void update(Messages messages);
	public List<Messages> findByid(Integer mid);
}

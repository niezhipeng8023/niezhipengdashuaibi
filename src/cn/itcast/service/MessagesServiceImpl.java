package cn.itcast.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.dao.MessagesDao;
import cn.itcast.dao.MessagesDaoImpl;
import cn.itcast.entity.Messages;


public class MessagesServiceImpl implements MessagesService {
    
	private MessagesDao messagesDao;

	public void setMessagesDao(MessagesDao messagesDao) {
		this.messagesDao = messagesDao;
	}

	public void save(Messages messages) {
		
		Date time = new Date();
		messages.setTime(time);
		messagesDao.add(messages);
		
	}

	
	public List<Messages> findall() {
	   List<Messages> MessList = messagesDao.findall();
		return MessList;
				
	}

	
	public List<Messages> findByusername(String username) {
		
		 System.out.println(username+"............");
		 List<Messages> MessList = messagesDao.findByusername(username);
		return MessList;
	}
    
    public void delById(Integer mid) {
    	messagesDao.delById(mid); 
    }

	
	public void update(Messages messages) {
		Date time = new Date();
		messages.setTime(time);
		messagesDao.update(messages);
		
	}

	
	public List<Messages> findByid(Integer mid) {
		List<Messages> messages = messagesDao.findByid(mid);
		
			return messages;
		
		
	}
}

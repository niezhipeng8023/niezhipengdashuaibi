package cn.itcast.action;

import java.util.List;

import javax.annotation.Resource;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.Messages;
import cn.itcast.service.MessagesService;

public class MessagesAction extends ActionSupport implements ModelDriven<Messages> {
	private List<Messages> MessagesList;
	private MessagesService messagesService;
	public void setMessagesService(MessagesService messagesService) {
		this.messagesService = messagesService;
	}
   
	private Messages messages = new Messages();
	public Messages getModel() {
		return messages;
	}
	public List<Messages> getMessagesList() {
		return MessagesList;
	}

	public void setMessagesList(List<Messages> messagesList) {
		MessagesList = messagesList;
	}
	
   public String save() throws Exception{
	   
	   messagesService.save(messages);   
	   
	   return "save";
	   
   }
   
public String findall() throws Exception{
	   ActionContext context = ActionContext.getContext();  
	   MessagesList = messagesService.findall();   
	   context.getSession().put("messall", MessagesList);
	   return "findall";
	   
   }

public String findByusername() throws Exception{
	   ActionContext context = ActionContext.getContext();  
	   MessagesList = messagesService.findByusername(messages.getUsername());   
	   context.getSession().put("messusername", MessagesList);
	   return "findByusername";
	   
}

public String delByid()  throws Exception{
	  messagesService.delById(messages.getMid());
	  return "delByid";
	
}

public String findByid()  throws Exception {
	 ActionContext context = ActionContext.getContext();  
	 MessagesList = messagesService.findByid(messages.getMid());
	 context.getSession().put("messupdate",MessagesList);
	 System.out.println(MessagesList.size());
	return "findByid";
	
}

public String update()  throws Exception {
	 messagesService.update(messages);
	return "update";
	
}
}

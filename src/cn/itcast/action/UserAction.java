package cn.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;
import cn.itcast.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{
      private UserService userService;
      private User user = new User();
  	public User getModel() {
		return user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login() throws Exception {
		ActionContext context = ActionContext.getContext();
		boolean flag = userService.findUser(user);
		if(flag){
			context.getSession().put("user", user);
			return SUCCESS;
		}else{
			context.put("tx", "µÇÂ¼Ê§°Ü£¬ÓÃ»§Ãû»òÃÜÂë´íÎó");
			return INPUT;
		}
		
	}
	
	public String reg() throws Exception {
		userService.saveUser(user);
		return "reg";
	}

	

}

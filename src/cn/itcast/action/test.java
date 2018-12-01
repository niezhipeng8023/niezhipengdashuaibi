package cn.itcast.action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.UserService;

public class test {
    @Test
   public void test1() {
    	ApplicationContext  context = 
    			new ClassPathXmlApplicationContext("bean.xml");
    	UserService userservice = (UserService) context.getBean("UserService");
    	
     }
}

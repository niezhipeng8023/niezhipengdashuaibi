package cn.itcast.interceptor;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor implements ServletContextAware {
	
	private static final long serialVersionUID = 1L;
	private ServletContext request;
	public void setServletContext(ServletContext request) {
		this.setRequest(request);
	}

	public ServletContext getRequest() {
		return request;
	}

	public void setRequest(ServletContext request) {
		this.request = request;
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context=invocation.getInvocationContext();
		Object user=context.getSession().get("user");
		if (user!=null){
			return invocation.invoke();
		}else{
			context.put("tx","Äú»¹Î´µÇÂ¼£¬ÇëÏÈµÇÂ¼");
			 return "pleaselogin";  
		}
	}


}

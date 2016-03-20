package prs.rfh.view;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
public class BaseAction extends ActionSupport implements ServletContextAware,SessionAware,ServletRequestAware{

	public static final String ACCESSABLE = "0";
	public static final String IS_ACCOUNT_ACCESSABLE = isAccountAccessable();
	public static final Logger log = LoggerFactory.getLogger(BaseAction.class);
	
	@Override
	public void setServletRequest(HttpServletRequest request) {//from requestaware
		// TODO Auto-generated method stub
		
	}
	//0 账户系统可用
	private static String isAccountAccessable() {
		//TODO 连接参数数据库获取开关状态
		//getSysParam(SysConstant.SWITCH.ACCOUNT_SWITCH_FLAG);
		return ACCESSABLE;
	}

	@Override
	public void setSession(Map<String, Object> session) {//from sessionaware
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletContext(ServletContext context) {//from sevletcontextaware
		// TODO Auto-generated method stub
		
	}
	/**
	 * 获取HttpServletRequest</br>
	 * 2016-03-20
	 * @author renfh
	 * @return HttpServletRequest
	 */
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	/**
	 * 获取HttpServletResponse</br>
	 * 2016-03-20
	 * @author renfh
	 * @return HttpServletResponse
	 */
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	
}

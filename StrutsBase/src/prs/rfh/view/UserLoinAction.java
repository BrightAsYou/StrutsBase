/**
 * 
 */
package prs.rfh.view;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

import prs.rfh.models.LoginUser;

/**
 * @version 1.0
 * @author renfh
 * @date 2016-03-20
 * @category 用户登录
 */
public class UserLoinAction extends BaseAction {
	
	private LoginUser loginUser;
	
	/**
	 * 登录
	 */
	public String login(){
		return SUCCESS;
	}

	public void validatelogin() {
		super.validate();
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}
	
	
}

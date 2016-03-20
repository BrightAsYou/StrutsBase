package prs.rfh.models;

import java.util.Date;

/**
 * 用户登录信息实体
 * @author renfh
 * 2016-03-20
 */
public class LoginUser {
	
	private String userName;
	private String hostIP;
	private String channel;
	private String platNo;
	private String pwd;
	private Date loginDate;
	private int FauilTime;
	
	public int getFauilTime() {
		return FauilTime;
	}
	public void setFauilTime(int fauilTime) {
		FauilTime = fauilTime;
	}
	public String getUserName() {
		return userName;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHostIP() {
		return hostIP;
	}
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getPlatNo() {
		return platNo;
	}
	public void setPlatNo(String platNo) {
		this.platNo = platNo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", hostIP=" + hostIP + ", channel=" + channel + ", platNo=" + platNo
				+ ", pwd=" + pwd + ", loginDate=" + loginDate + ", FauilTime=" + FauilTime + "]";
	}
	
}

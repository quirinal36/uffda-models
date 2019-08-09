package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Voting {
	int id;
	int recipeId;
	int userId;
	String anonUser;
	String os;
	String browser;
	int mobile;
	String ipAddr;
	long voteDate;
	
	public Voting() {
		
	}
	public static Voting newInstance(int recipeId) {
		Voting result = new Voting();
		result.setRecipeId(recipeId);
		return result;
	}
	public static Voting newInstance() {
		Voting result = new Voting();
		return result;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getAnonUser() {
		return anonUser;
	}

	public void setAnonUser(String anonUser) {
		this.anonUser = anonUser;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public long getVoteDate() {
		return voteDate;
	}
	public void setVoteDate(long voteDate) {
		this.voteDate = voteDate;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

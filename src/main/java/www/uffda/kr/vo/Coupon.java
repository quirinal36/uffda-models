package www.uffda.kr.vo;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Coupon extends Paging{
	public static final String COUPON_KEY = "coupon";
	
	private int id;
	private int userId;
	private Date registed;
	private String coupon;
	private int used;
	private int limitNum;
	private String username;
	private Date lastUsedDate;
	private int recipeId;
	
	public Coupon() {
		
	}
	
	public static Coupon newInstance() {
		Coupon coupon = new Coupon();
		return coupon;
	}
	
	public static Coupon newInstance(int userId) {
		Coupon result = new Coupon();
		result.setUserId(userId);
		return result;
	}
	
	public static Coupon newInstance(String coupon) {
		Coupon result = new Coupon();
		result.setCoupon(coupon);
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getRegisted() {
		return registed;
	}

	public void setRegisted(Date registed) {
		this.registed = registed;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}
	public int getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getLastUsedDate() {
		return lastUsedDate;
	}
	public void setLastUsedDate(Date lastUsedDate) {
		this.lastUsedDate = lastUsedDate;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

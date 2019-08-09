package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LikeChef {
	private int id;
	private int userId;
	private int chefId;
	
	public LikeChef() {
		
	}
	public static LikeChef newInstance() {
		LikeChef likeChef = new LikeChef();
		return likeChef;
	}
	public static LikeChef newInstance(int chefId) {
		LikeChef likeChef = new LikeChef();
		likeChef.setChefId(chefId);
		return likeChef;
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
	public int getChefId() {
		return chefId;
	}
	public void setChefId(int chefId) {
		this.chefId = chefId;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

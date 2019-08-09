package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import www.uffda.kr.vo.Paging;

public class LikeIt extends Paging{
	private int id;
	private int userId;
	private int recipeId;
	
	public LikeIt() {
	}
	
	public static LikeIt newInstance(int userId, int recipeId) {
		LikeIt result = newInstance();
		result.setUserId(userId);
		result.setRecipeId(recipeId);
		return result;
	}
	public static LikeIt newInstance(int recipeId) {
		LikeIt result = newInstance();
		result.setRecipeId(recipeId);
		return result;
	}
	public static LikeIt newInstance() {
		LikeIt result = new LikeIt();
		result.setFrom(0);
		result.setPageSize(24);
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

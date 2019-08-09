package www.uffda.kr.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 레시피 해시태그
 * 분류별 검색용도로 사용
 * 
 * @author Lee
 *
 */
public class HashTag implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3306621607768929052L;
	
	private int id;
	private int recipeId;
	private String tag;
	
	public HashTag() {
	}
	public static HashTag newInstance(int id, String tag) {
		HashTag hash = new HashTag();
		hash.setId(id);
		hash.setTag(tag);
		return hash;
	}
	public static HashTag newInstance(String tag) {
		HashTag hash = new HashTag();
		hash.setTag(tag);
		return hash;
	}
	public static HashTag newInstance(int recipeId) {
		HashTag hash = new HashTag();
		hash.setRecipeId(recipeId);
		return hash;
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

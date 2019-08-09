package www.uffda.kr.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import www.uffda.kr.vo.Paging;


/**
 * The persistent class for the PhotoComplete database table.
 * 레시피 요리 완성 사진
 */
public class PhotoComplete extends Paging implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int pOrder;

	private String url;

	//bi-directional many-to-one association to Recipe
	private Recipe recipe;

	public PhotoComplete() {
		recipe = Recipe.newInstance(0, 0);
	}
	
	public static PhotoComplete newInstance(int recipeId) {
		PhotoComplete photo = new PhotoComplete();
		photo.getRecipe().setId(recipeId);
		return photo;
	}
	public static PhotoComplete newInstance(int total, int page) {
		PhotoComplete photo = new PhotoComplete();
		
		photo.setTotalCount(total);
		photo.setPageNo(page);
		return photo;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpOrder() {
		return pOrder;
	}

	public void setpOrder(int pOrder) {
		this.pOrder = pOrder;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Recipe getRecipe() {
		return this.recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
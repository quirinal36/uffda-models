package www.uffda.kr.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import www.uffda.kr.vo.Paging;

public class RecipeStep extends Paging implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String description;

	private int sOrder;

	private String photoUrl;

	private String target;
	
	private int recipe_id;
	
	//bi-directional many-to-one association to Recipe
	private Recipe recipe;

	public RecipeStep() {
		recipe = Recipe.newInstance(0, 0);
	}
	
	public static RecipeStep newInstance(int recipeId) {
		RecipeStep recipe = new RecipeStep();
		recipe.getRecipe().setId(recipeId);
		return recipe;
	}
	
	public static RecipeStep newInstance(int total, int page) {
		RecipeStep recipe = new RecipeStep();
		recipe.setTotalCount(total);
		recipe.setPageNo(page);
		return recipe;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getsOrder() {
		return sOrder;
	}

	public void setsOrder(int sOrder) {
		this.sOrder = sOrder;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
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
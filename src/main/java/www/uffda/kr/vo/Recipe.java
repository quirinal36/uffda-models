package www.uffda.kr.vo;

import java.io.Serializable;
import java.sql.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import www.uffda.kr.vo.Paging;

import java.util.List;

/**
 * The persistent class for the Recipe database table.
 * 
 */
public class Recipe extends Paging implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int IN_VOTING = 1;
	public static final int IN_SELLING = 2;
	public static final int EXAMINATION = 3;
	public static final int IN_MAKING = 4;
	public static final int PAUSED = 5;
	public static final int DELETED_BY_CHEF = 6;
	public static final int DELETED_BY_ADMIN = 7;
	public static final int RECIPE = 8;
	
	private final int votingSuccess = 4;
	private int id;
	private int uploader_id;	// 올린사람
	private int amount;			// 1인분, 2인분, 4인분
	private String comment;		// 우프더에게 남길말
	private String description;	// 간략설명
	private String ingredient;	// 재료
	private int level;			// 난이도
	private int price;			// 가격
	private int time;			// 걸리는시간
	private String title;		// 제목
	private int votingCount;	// 투표 득표수
	private String utensils;	// 조리도구
	private Date uploadDate;	
	private int seen;			// 조회수
	private String photoComplete;	// 대표사진
	private int shared;			// 공유하기
	private int status;
	
	//bi-directional many-to-one association to PhotoComplete
	private List<PhotoComplete> photoCompletes;	// 대표사진 리스트

	//bi-directional many-to-one association to RecipeStep
	private List<RecipeStep> recipeSteps;	// 레시피 리스트
	
	public Recipe() {
	}
	
	public static Recipe newInstance(int recipeId) {
		Recipe recipe = new Recipe();
		recipe.setId(recipeId);
		return recipe;
	}
	public static Recipe newInstance(int total, int page) {
		Recipe recipe = new Recipe();
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
	
	public int getUploader_id() {
		return uploader_id;
	}

	public void setUploader_id(int uploader_id) {
		this.uploader_id = uploader_id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredient() {
		return this.ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public List<PhotoComplete> getPhotoCompletes() {
		return this.photoCompletes;
	}

	public void setPhotoCompletes(List<PhotoComplete> photoCompletes) {
		this.photoCompletes = photoCompletes;
	}
	
	public PhotoComplete addPhotoComplete(PhotoComplete photoComplete) {
		getPhotoCompletes().add(photoComplete);
		photoComplete.setRecipe(this);

		return photoComplete;
	}

	public PhotoComplete removePhotoComplete(PhotoComplete photoComplete) {
		getPhotoCompletes().remove(photoComplete);
		photoComplete.setRecipe(null);

		return photoComplete;
	}

	public List<RecipeStep> getRecipeSteps() {
		return this.recipeSteps;
	}

	public void setRecipeSteps(List<RecipeStep> recipeSteps) {
		this.recipeSteps = recipeSteps;
	}

	public RecipeStep addRecipeStep(RecipeStep recipeStep) {
		getRecipeSteps().add(recipeStep);
		recipeStep.setRecipe(this);

		return recipeStep;
	}

	public RecipeStep removeRecipeStep(RecipeStep recipeStep) {
		getRecipeSteps().remove(recipeStep);
		recipeStep.setRecipe(null);

		return recipeStep;
	}
	
	public String getPhotoComplete() {
		return photoComplete;
	}

	public void setPhotoComplete(String photoComplete) {
		this.photoComplete = photoComplete;
	}
	
	public int getVotingCount() {
		return votingCount;
	}
	
	public void setVotingCount(int votingCount) {
		this.votingCount = votingCount;
	}
	
	public String getUtensils() {
		return utensils;
	}
	public void setUtensils(String utensils) {
		this.utensils = utensils;
	}
	public int getSeen() {
		return seen;
	}
	public void setSeen(int seen) {
		this.seen = seen;
	}
	
	public int getShared() {
		return shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public int getVotingSuccess() {
		return this.votingSuccess;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
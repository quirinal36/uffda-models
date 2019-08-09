package www.uffda.kr.vo;

import java.time.DayOfWeek;
import java.util.logging.Logger;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.json.JSONException;
import org.json.JSONObject;

public class Cart implements Comparable<Cart>, Cloneable{
	final static private Logger logger = Logger.getLogger(Cart.class.getSimpleName());
	public static final int WEEK_TUE = DayOfWeek.TUESDAY.getValue();
	public static final int WEEK_FRI = DayOfWeek.FRIDAY.getValue();
	
	public static final String ID_KEY = "id";
	public static final String CART_KEY = "uffda_cart";
	public static final String RECIPEID_KEY = "recipeId";
	public static final String AMOUNT_KEY = "amount";
	public static final String TITLE_KEY = "recipeTitle";
	public static final String PRICE_KEY = "price";
	public static final String USER_ID_KEY = "userId";
	public static final String PAID_KEY = "paid";
	public static final String WEEKDAY_KEY = "weekday";
	public static final String ADDRESSID_KEY = "address_id";
	
	private int id;
	private int userId;
	private int recipeId;
	private int amount;
	private int price;
	private int paid;
	private String recipeTitle;
	private int weekday;
	private String shipping;
	private int total;
	private int addressId;
	
	public Cart() {
	}
	public static Cart newInstance() {
		Cart result = new Cart();
		return result;
	}
	public static Cart newInstance(int userId, int recipeId) {
		Cart result = new Cart();
		result.setUserId(userId);
		result.setRecipeId(recipeId);
		return result;
	}
	public static Cart newInstance(int recipeId) {
		Cart result = new Cart();
		result.setRecipeId(recipeId);
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public String getRecipeTitle() {
		return recipeTitle;
	}
	public void setRecipeTitle(String recipeTitle) {
		this.recipeTitle = recipeTitle;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public static Cart parse(JSONObject input) {
		Cart cart = Cart.newInstance();
		
		if(input.has(RECIPEID_KEY)) {
			cart.setRecipeId(input.getInt(RECIPEID_KEY));
		}
		if(input.has(AMOUNT_KEY)) {
			cart.setAmount(input.getInt(AMOUNT_KEY));
		}
		if(input.has(TITLE_KEY) && (input.get(TITLE_KEY) instanceof String)){
			try {
				cart.setRecipeTitle(input.getString(TITLE_KEY));
			}catch(JSONException e) {
				e.printStackTrace();
				logger.info(e.getLocalizedMessage());
			}
		}
		if(input.has(USER_ID_KEY)) {
			try {
				cart.setUserId(input.getInt(USER_ID_KEY));
			}catch(Exception e) {
				logger.info(e.getLocalizedMessage());
			}
		}
		if(input.has(PRICE_KEY)) {
			cart.setPrice(input.getInt(PRICE_KEY));
		}
		if(input.has(ID_KEY)) {
			cart.setId(input.getInt(ID_KEY));
		}
		if(input.has(PAID_KEY)) {
			cart.setPaid(input.getInt(PAID_KEY));
		}
		if(input.has(WEEKDAY_KEY)) {
			cart.setWeekday(input.getInt(WEEKDAY_KEY));
		}
		if(input.has(ADDRESSID_KEY)) {
			cart.setAddressId(input.getInt(ADDRESSID_KEY));
		}
		return cart;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	@Override
	public int compareTo(Cart cart) {
		return this.recipeId - cart.recipeId;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

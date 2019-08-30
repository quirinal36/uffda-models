package www.uffda.kr.vo;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Checkout {
	private int id;
	private int recipeId;
	private String impUid;
	private int userId;
	private int amount;
	private int address_id;
	private String title;
	private int paid;
	private int weekday;
	private Date updateDate;
	private Date issueDate;
	private int isDeliveryComplete;
	private int isShipped;
	private int isMaking;
	private int isPayed;
	private int isRefunded;
	private int isCanceled;
	private int confirm;
	private Timestamp shippingDate;
	private int cartId;
	private int impResultStatus;
	private AddressBook addressBook;
	private int price;
	private String shippingInfo;
	
	public Checkout() {
	}
	public static Checkout newInstance() {
		Checkout result = new Checkout();
		result.setImpResultStatus(1);
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
	public String getImpUid() {
		return impUid;
	}
	public void setImpUid(String impUid) {
		this.impUid = impUid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
		
		LocalDateTime dateTime = LocalDateTime.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		Date tempDate = new Date();
		if(this.weekday == DayOfWeek.TUESDAY.getValue()) {
			LocalDateTime nextWeekTuesday = dateTime.plusWeeks(1).with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
			tempDate = Date.from(nextWeekTuesday.atZone(ZoneId.systemDefault()).toInstant());
		}else if(this.weekday == DayOfWeek.FRIDAY.getValue()){
			LocalDateTime nextWeekFriday = dateTime.plusWeeks(1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
			tempDate = Date.from(nextWeekFriday.atZone(ZoneId.systemDefault()).toInstant());
		}
		this.shippingDate = new Timestamp(tempDate.getTime());
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public int getIsDeliveryComplete() {
		return isDeliveryComplete;
	}
	public void setIsDeliveryComplete(int isDeliveryComplete) {
		this.isDeliveryComplete = isDeliveryComplete;
	}
	public int getIsShipped() {
		return isShipped;
	}
	public void setIsShipped(int isShipped) {
		this.isShipped = isShipped;
	}
	public int getIsMaking() {
		return isMaking;
	}
	public void setIsMaking(int isMaking) {
		this.isMaking = isMaking;
	}
	public int getIsPayed() {
		return isPayed;
	}
	public void setIsPayed(int isPayed) {
		this.isPayed = isPayed;
	}
	public int getIsRefunded() {
		return isRefunded;
	}
	public void setIsRefunded(int isRefunded) {
		this.isRefunded = isRefunded;
	}
	public int getIsCanceled() {
		return isCanceled;
	}
	public void setIsCanceled(int isCanceled) {
		this.isCanceled = isCanceled;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}
	public Timestamp getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Timestamp shippingDate) {
		this.shippingDate = shippingDate;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getImpResultStatus() {
		return impResultStatus;
	}
	public void setImpResultStatus(int impResultStatus) {
		this.impResultStatus = impResultStatus;
	}
	public AddressBook getAddressBook() {
		return addressBook;
	}
	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE); 
	}
}

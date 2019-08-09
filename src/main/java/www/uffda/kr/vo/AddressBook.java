package www.uffda.kr.vo;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddressBook extends Paging {
	private int id;
	private int userId;
	private String name;
	private String phone;
	private String address;
	private String address_detail;
	private int postcode;
	private Date registed_date;
	private Date updated_date;
	private int represented;
	
	public AddressBook() {
	}
	public static AddressBook newInstance() {
		AddressBook result = new AddressBook();
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public Date getRegisted_date() {
		return registed_date;
	}
	public void setRegisted_date(Date registed_date) {
		this.registed_date = registed_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public int getRepresented() {
		return represented;
	}
	public void setRepresented(int represented) {
		this.represented = represented;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

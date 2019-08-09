package www.uffda.kr.vo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import www.uffda.kr.vo.AddressBook;
import www.uffda.kr.vo.Checkout;

public class CheckoutAddressInfo {
	private AddressBook address;
	private List<Checkout> checkoutList;
	private ImpResultStatus impResultStatus;
	private int total;
	private int amount;
	private int shippingStatus;
	private Timestamp shippingDate;
	
	public CheckoutAddressInfo() {
		checkoutList = new ArrayList<Checkout>();
		address = new AddressBook();
		total = 0;
	}
	public CheckoutAddressInfo newInstance() {
		CheckoutAddressInfo result = new CheckoutAddressInfo();
		return result;
	}
	public AddressBook getAddress() {
		return address;
	}
	public void setAddress(AddressBook address) {
		this.address = address;
	}
	public List<Checkout> getCheckoutList() {
		return checkoutList;
	}
	public void setCheckoutList(List<Checkout> checkoutList) {
		this.checkoutList = checkoutList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void addTotal(int param) {
		this.total = this.total + param;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void addAmount(int param) {
		this.amount = this.amount + param;
	}
	public int getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(int shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public ImpResultStatus getImpResultStatus() {
		return impResultStatus;
	}
	public void setImpResultStatus(ImpResultStatus impResultStatus) {
		this.impResultStatus = impResultStatus;
	}
	public Timestamp getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Timestamp shippingDate) {
		this.shippingDate = shippingDate;
	}
}

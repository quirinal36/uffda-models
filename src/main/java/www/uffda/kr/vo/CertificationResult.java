package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.json.JSONObject;

public class CertificationResult {
	private String imp_uid;
	private String gender;
	private long birth;
	private String name;
	private boolean certified;
	private String unique_key;
	private boolean foreigner;
	private String phone;
	private boolean made;
	
	public CertificationResult() {
		
	}
	public static CertificationResult newInstance() {
		CertificationResult result = new CertificationResult();
		return result;
	}
	public String getImp_uid() {
		return imp_uid;
	}
	public void setImp_uid(String imp_uid) {
		this.imp_uid = imp_uid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getBirth() {
		return birth;
	}
	public void setBirth(long birth) {
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	public String getUnique_key() {
		return unique_key;
	}
	public void setUnique_key(String unique_key) {
		this.unique_key = unique_key;
	}
	public boolean getForeigner() {
		return foreigner;
	}
	public void setForeigner(boolean foreigner) {
		this.foreigner = foreigner;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isMade() {
		return made;
	}
	public void setMade(boolean made) {
		this.made = made;
	}
	public static CertificationResult makeNewUserInfo() {
		CertificationResult result = new CertificationResult();
		result.setCertified(true);
		result.setMade(true);
		return result;
	}
	public static CertificationResult parse(JSONObject json) {
		CertificationResult result = new CertificationResult();
		if(json.has("certified")) {
			result.setCertified(json.getBoolean("certified"));
		}
		if(json.has("unique_key")) {
			result.setUnique_key(json.getString("unique_key"));
		}
		if(json.has("birth")) {
		result.setBirth(json.getLong("birth"));
		}
		if(json.has("imp_uid")) {
		result.setImp_uid(json.getString("imp_uid"));
		}
		if(json.has("name")) {
		result.setName(json.getString("name"));
		}
		if(json.has("foreigner")) {
		result.setForeigner(json.getBoolean("foreigner"));
		}
		if(json.has("gender")) {
		result.setGender(json.getString("gender"));
		}
		if(json.has("phone")) {
			result.setPhone(json.getString("phone"));
		}
		return result;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ImpResultStatus {
	int id;
	String impStatus;
	String impStatusKr;
	
	public static ImpResultStatus newInstance() {
		ImpResultStatus result = new ImpResultStatus();
		return result;
	}
	public ImpResultStatus() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImpStatus() {
		return impStatus;
	}

	public void setImpStatus(String impStatus) {
		this.impStatus = impStatus;
	}

	public String getImpStatusKr() {
		return impStatusKr;
	}

	public void setImpStatusKr(String impStatusKr) {
		this.impStatusKr = impStatusKr;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

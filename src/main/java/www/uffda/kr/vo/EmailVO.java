package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EmailVO {
	private final String toEmail;
	private final String senderEmail;
	private String subject;
	private String message;
	
	public EmailVO(String toEmail, String senderEmail) {
		super();
		this.toEmail = toEmail;
		this.senderEmail = senderEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getToEmail() {
		return toEmail;
	}

	public String getSenderEmail() {
		return senderEmail;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

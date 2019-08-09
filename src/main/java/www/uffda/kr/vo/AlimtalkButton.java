package www.uffda.kr.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AlimtalkButton {
	private final String name;
	private final String type;
	private final String url_mobile;
	private final String url_pc;
	
	public AlimtalkButton(String name, String type, String url_mobile, String url_pc) {
		this.name = name;
		this.type = type;
		this.url_mobile = url_mobile;
		this.url_pc = url_pc;
	}
	
	public static AlimtalkButtonBuilder builder() {
		return new AlimtalkButtonBuilder();
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getUrl_mobile() {
		return url_mobile;
	}
	public String getUrl_pc() {
		return url_pc;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

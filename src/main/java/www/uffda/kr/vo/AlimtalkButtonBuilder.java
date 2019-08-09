package www.uffda.kr.vo;

public class AlimtalkButtonBuilder {
	private String name;
	private String type;
	private String url_mobile;
	private String url_pc;
	
	public String getName() {
		return name;
	}
	public AlimtalkButtonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public String getType() {
		return type;
	}
	public AlimtalkButtonBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public String getUrl_mobile() {
		return url_mobile;
	}
	public AlimtalkButtonBuilder setUrl_mobile(String url_mobile) {
		this.url_mobile = url_mobile;
		return this;
	}
	public String getUrl_pc() {
		return url_pc;
	}
	public AlimtalkButtonBuilder setUrl_pc(String url_pc) {
		this.url_pc = url_pc;
		return this;
	}
	public AlimtalkButton build() {
		AlimtalkButton button = new AlimtalkButton(name, type, url_mobile, url_pc);
		return button;
	}
}

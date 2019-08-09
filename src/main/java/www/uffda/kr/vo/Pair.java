package www.uffda.kr.vo;

public class Pair <L, R>{
	Object id;
	Object name;
	
	public Pair(Object id, Object name) {
		this.id = id;
		this.name = name;
	}
	public Pair() {
		super();
	}
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
}

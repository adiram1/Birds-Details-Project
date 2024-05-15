package shadi_lab5;

public class Birds {
	protected String type;
	protected double size;
	protected double wingLen;
	public Birds(String type, double size, double wingLen) {
		super();
		this.type = type;
		this.size = size;
		this.wingLen = wingLen;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getWingLen() {
		return wingLen;
	}
	public void setWingLen(double wingLen) {
		this.wingLen = wingLen;
	}
	@Override
	public String toString() {
		return "Birds [type=" + type + ", size=" + size + ", wingLen=" + wingLen + "]";
	}
	
	
}

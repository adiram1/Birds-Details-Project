package shadi_lab5;

public class Area {
	private String name;
	private String coutry;
	private String description;
	private double distance;
	
	public Area(String name, String coutry, String description, double distance) {
		super();
		this.name = name;
		this.coutry = coutry;
		this.description = description;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoutry() {
		return coutry;
	}

	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Area [name=" + name + ", coutry=" + coutry + ", description=" + description + ", distance=" + distance
				+ "]";
	}
	
	
	
}

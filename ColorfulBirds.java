package shadi_lab5;

import java.util.Arrays;

public class ColorfulBirds extends Birds {
	private String[] colors;
	private int cntColors;
	private double lifeLen;
	private int height;
	private int width;
	
	public ColorfulBirds(String type, double size, double wingLen, double lifeLen,
			int height, int width) {
		super(type, size, wingLen);
		this.cntColors = 0;
		this.colors = new String[cntColors];
		this.lifeLen = lifeLen;
		this.height = height;
		this.width = width;
	}

	public double getLifeLen() {
		return lifeLen;
	}

	public void setLifeLen(double lifeLen) {
		this.lifeLen = lifeLen;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String[] getColors() {
		return colors;
	}
	
	public boolean addColor(String color) {
		if(color.equals("")) return false;
		for(int i=0;i<cntColors;i++) 
			if(colors[i].equals(color)) return false;
		colors = Arrays.copyOf(colors, cntColors+1);
		colors[cntColors++] = color;
		return true;
	}
	
	public int getCntColors() {
		return cntColors;
	}

	public void printColor() {
		for(int i=0;i<cntColors;i++) System.out.println(colors[i]);
	}
	
	public void printDetails() {
		System.out.println("Cage width: " + this.width);
		System.out.println("Cage height: "+this.height);
	}
	
	@Override
	public String toString() {
		return super.toString() + "ColorfulBirds [colors=" + Arrays.toString(colors) + ", cntColors=" + cntColors + ", lifeLen=" + lifeLen
				+ ", height=" + height + ", width=" + width + "]";
	}
	
	
	
}

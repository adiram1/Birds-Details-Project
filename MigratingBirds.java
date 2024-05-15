package shadi_lab5;

import java.util.Arrays;

public class MigratingBirds extends Birds {
	private Area[] areas;
	private int cnt;
	
	public MigratingBirds(String type, double size, double wingLen) {
		super(type, size, wingLen);
		this.cnt = 0;
		this.areas = new Area[cnt];
	}

	public Area[] getAreas() {
		return areas;
	}
	
	public boolean addArea(Area a) {
		if(a==null) return false;
		for(int i=0;i<cnt;i++) 
			if(areas[i].toString().equals(a.toString())) return false;
		areas = Arrays.copyOf(areas, cnt+1);
		areas[cnt++] = a;
		return true;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void printCountries() {
		for(int i=0;i<cnt;i++) 
			System.out.println(areas[i].getCoutry());
	}

	public void getDistance() {
		for(int i=0;i<cnt;i++) 
			System.out.println(areas[i].getDescription());
	}
	
	@Override
	public String toString() {
		return super.toString() + "MigratingBirds [areas=" + Arrays.toString(areas) + ", cnt=" + cnt + "]";
	}	
}

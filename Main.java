package shadi_lab5;

import java.util.Scanner;

public class Main {
	public static void printDetailsOfAll(Birds[] birds) {
		for (int i = 0; i < birds.length; i++) {
			if (birds[i] instanceof MigratingBirds) {
				for (int j = 0; j < ((MigratingBirds) birds[i]).getCnt(); j++)
					System.out.println(((MigratingBirds) birds[i]).getAreas()[j].getCoutry());
			} else if (birds[i] instanceof ColorfulBirds)
				((ColorfulBirds) birds[i]).printDetails();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Birds[] birds = new Birds[4];
		String type, areaName, country, discription;
		double size, wingsLen, lifeLen, distance;
		int height, width;
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the type of the bird " + (i + 1) + ": ");
			type = in.next();
			System.out.println("Enter the size of the bird " + (i + 1) + ": ");
			size = in.nextDouble();
			System.out.println("Enter the wings lenght of the bird " + (i + 1) + ": ");
			wingsLen = in.nextDouble();
			if (i < 2) {
				System.out.println("This Migrating bird number " + (i + 1) + ": " + type);
				birds[i] = new MigratingBirds(type, size, wingsLen);
			} else {
				System.out.println("Enter the life length of bird " + (i + 1) + ": ");
				lifeLen = in.nextDouble();
				System.out.println("Enter the height of cage for bird number " + (i + 1) + ": ");
				height = in.nextInt();
				System.out.println("Enter the width of cage for bird number " + (i + 1) + ": ");
				width = in.nextInt();
				birds[i] = new ColorfulBirds(type, size, wingsLen, lifeLen, height, width);
				System.out.println("This colorFul bird number " + (i + 1) + ": " + type);
			}
			if (birds[i] instanceof MigratingBirds) {
				for (int j = 0; j < 2; j++) {
					System.out.println(
							"Enter a area name of bird number " + (i + 1) + " from type " + birds[i].getType() + ": ");
					areaName = in.next();
					System.out.println("Enter a country name of area number " + (i + 1) + ": ");
					country = in.next();
					System.out.println("Enter a area discription of area number " + (i + 1) + ": ");
					discription = in.next();
					System.out.println("Enter a distance of area number " + (i + 1) + ": ");
					distance = in.nextDouble();
					((MigratingBirds) birds[i]).addArea(new Area(areaName, country, discription, distance));
				}
			} else if (birds[i] instanceof ColorfulBirds) {
				for (int j = 0; j < 2; j++) {
					System.out.println("Enter 2 types of color for bird number " + (i + 1));
					System.out.println("Color "+(j+1)+": ");
					((ColorfulBirds) birds[i]).addColor(in.next());
				}
			}
		}
		printDetailsOfAll(birds);
	}
}
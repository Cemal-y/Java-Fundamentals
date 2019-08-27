package be.intecbrussel.entities.plant_entities;

public class Plant implements Comparable<Plant>{

	protected String name;
	protected double height;
		
	public Plant(String name) {
		this.name = name;
	}

	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	public int compareTo(Plant plant) {
		return this.getName().compareTo(plant.getName());	
	}	
		
}

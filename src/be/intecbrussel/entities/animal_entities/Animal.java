package be.intecbrussel.entities.animal_entities;

//TODO je hebt de UML niet strict gevolgd
public class Animal implements Comparable<Animal>{

	protected String name;
	protected double weight;
	protected double height;
	protected double length;
	
	public Animal(String name) {	
		this.name = name;
	}
	
	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int compareTo(Animal animal) {
		return this.getName().compareTo(animal.getName());	
	}
	
}

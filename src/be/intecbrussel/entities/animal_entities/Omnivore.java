package be.intecbrussel.entities.animal_entities;

import java.util.Set;

import be.intecbrussel.entities.plant_entities.*;

//this class is  a combination of carnivore and herbivore
public class Omnivore extends Animal{

	protected Set<Plant> plantDiet;
	protected double maxFoodSize;
	
	public Omnivore(String name) {
		super(name);
	}
	
	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	//with this method, the user can add a plant to our plantDiet set
	public void addPlantToDiet(Plant plant) {
		plantDiet.add(plant);
	}

	@Override
	public String toString() {
		return "Omnivore [name=" + name + ", weight=" + weight + ", height=" + height + ", length=" + length + "]";
	}
	
}

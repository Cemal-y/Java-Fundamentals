package be.intecbrussel.entities.animal_entities;

import java.util.Set;

import be.intecbrussel.entities.plant_entities.*;

public class Herbivore extends Animal{

	Set<Plant> plantDiet;

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	//with this method, the user can add a plantDiet to our plant set
	public void addPlantToDiet(Plant plant) {
		plantDiet.add(plant);
	}

	//TODO never leave an empty method
	public void printDiet() {
		
	}

	@Override
	public String toString() {
		return "Herbivore [name=" + name + ", weight=" + weight + ", height=" + height + ", length=" + length + "]";
	}
	
}

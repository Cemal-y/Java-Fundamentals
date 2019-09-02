package be.intecbrussel.service;
//TODO remove unnecessary imports
import java.util.*;
import java.util.stream.*;

import be.intecbrussel.entities.animal_entities.*;
import be.intecbrussel.entities.plant_entities.*;


public class ForestNotebook {

	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;
	
	public ForestNotebook() {
		carnivores= new LinkedList<>();
		omnivores = new LinkedList<>();
		herbivores= new LinkedList<>();
		animals = new LinkedList<>();
		plants= new LinkedList<>();
	}

	public List<Carnivore> getCarnivores() {		
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		plantCount = plants.size();
		return plantCount;
	}

	public int getAnimalCount() {
		animalCount = animals.size();
		return animalCount;
	}
	
	public void addAnimal(Animal animal){		
		if (animal != null && animals.contains(animal)) {
			try {
				throw new MemberAlreadyExistsException("Animal is already in list");
			} catch (MemberAlreadyExistsException e) {
				System.out.println(e.getMessage()); 
			}	
		} else if (animal instanceof Carnivore) {
			carnivores.add((Carnivore) animal);
		}else if (animal instanceof Omnivore) {
			omnivores.add((Omnivore) animal);
		}else if (animal instanceof Herbivore) {
			herbivores.add((Herbivore) animal);
		}
		
		animals.add(animal);
	}
	
	public void addPlant(Plant plant){
		if (plant != null && plants.contains(plant)) {
			try {
				throw new MemberAlreadyExistsException("Plant is already in list");
			} catch (MemberAlreadyExistsException e) {
				System.out.println(e.getMessage()); 
			}	
		}
		plants.add(plant);
	}

	public void PrintNotebook(){
		System.out.println("Animals in the Forest Notebook are; ");
		animals.forEach(System.out::println);
		System.out.println("Plants in the Forest Notebook are; ");
		plants.forEach(System.out::println);
	}
	
	public void sortAnimalsByName(){
		Collections.sort(animals);
	}

	public void sortPlantsByName(){
		Collections.sort(animals);
	}
	
	public void sortAnimalsByHeight(){
		animals.sort(new AnimalsByHeightComparator());
	}
	
	public void sortPlantsByHeight(){
		plants.sort(new PlantsByHeightComparator());
	}
	
}

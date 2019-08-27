package be.intecbrussel.forestbook_app;

import be.intecbrussel.service.*;

import java.util.*;

import be.intecbrussel.entities.animal_entities.*;
import be.intecbrussel.entities.plant_entities.*;

public class ForestBookApp {

	public static void main(String[] args) {
		// new Forest Notebook
		ForestNotebook forestNotebook = new ForestNotebook();
		
		Random randomGenerator = new Random(); 
		
		// Plants
		Flower orchid = new Flower("Orchid", 0.2);
		orchid.setSmell(Scent.MUSKY);
		Tree limeTree = new Tree("Lime Tree", 20);
		limeTree.setLeafType(LeafType.HAND);
		Bush blueberry = new Bush("Blueberry", 0.7);
		blueberry.setLeafType(LeafType.HEART);
		blueberry.setHeight(0.3);
		blueberry.setFruit("Blueberry");
		Weed grass = new Weed("Grass", 0.1);
		grass.setArea(20);
		grass.setHeight(0.8);
		Tree appleTree = new Tree("Apple Tree", 10);
		appleTree.setLeafType(LeafType.ROUND);

		// Adding plants to the book
		Plant[] plants = { grass, appleTree, limeTree, blueberry, orchid };
		for (Plant plantsToAdd : plants) {
			forestNotebook.addPlant(plantsToAdd);
		}

		// Animals
		Carnivore lion = new Carnivore("Lion", 90, 1.3, 2.3);
		Omnivore bear = new Omnivore("Bear", 90, 2.5, 2.3);
		Omnivore pig = new Omnivore("Pig", 90, 1, 2.3);
		Herbivore sheep = new Herbivore("Sheep", 90, 0.5, 2.3);
		Carnivore tiger = new Carnivore("Tiger", 90, 1.2, 2.3);
		Omnivore chicken = new Omnivore("Chicken", 90, 0.3, 2.3);
		Omnivore rat = new Omnivore("Rat", 90, 0.05, 2.3);
		Herbivore cow = new Herbivore("Cow", 90, 1.5, 2.3);
		Carnivore chita = new Carnivore("Chita", 90, 1.4, 2.3);

		// Adding animals to the book
		Animal[] animals = { lion, bear, pig, sheep, tiger, chicken, rat, cow, chita };
		for (Animal animalToAdd : animals) {
			forestNotebook.addAnimal(animalToAdd);
		}

		// Diets for Omnivores
		Set<Plant> omnivoreDiet = new HashSet<>();
		omnivoreDiet.add(grass);
		omnivoreDiet.add(orchid);
		// Diets for Herbivores
		Set<Plant> herbivoreDiet = new HashSet<>();
		herbivoreDiet.add(grass);
		herbivoreDiet.add(appleTree);
		herbivoreDiet.add(blueberry);

		// Setting diets of Omnivores
		Iterator iteratorForOmnivores = forestNotebook.getOmnivores().iterator();
		while (iteratorForOmnivores.hasNext()) {
			Omnivore omnivoreAnimal = (Omnivore) iteratorForOmnivores.next();
			omnivoreAnimal.setPlantDiet(omnivoreDiet);
		}
		// Setting diets of Herbivores
		Iterator iteratorForHerbivores = forestNotebook.getHerbivores().iterator();
		while (iteratorForHerbivores.hasNext()) {
			Herbivore herbivoreAnimal = (Herbivore) iteratorForHerbivores.next();
			herbivoreAnimal.setPlantDiet(herbivoreDiet);
		}
		
		//Adding plant to diet
		sheep.addPlantToDiet(orchid);
		
		//Setting Maximum food Size for a Carnivore
		lion.setMaxFoodSize(85);
		
		// printing animals and plants in the book
		System.out.println("Before Sorting:");
		forestNotebook.PrintNotebook();

		// printing Carnivores
		System.out.println(forestNotebook.getCarnivores());
		// printing Omnivores
		System.out.println(forestNotebook.getOmnivores());
		// printing Herbivores
		System.out.println(forestNotebook.getHerbivores());

		// Sorting Animals by name
		forestNotebook.sortAnimalsByName();
		System.out.println("After sorting animals by name:");
		forestNotebook.PrintNotebook();

		// Sorting Plants by name
		forestNotebook.sortPlantsByName();
		System.out.println("After sorting plants by name:");
		forestNotebook.PrintNotebook();

		// Sorting Animals by height
		forestNotebook.sortAnimalsByHeight();
		System.out.println("After sorting animals by height:");
		forestNotebook.PrintNotebook();

		// Sorting Plants by height
		forestNotebook.sortPlantsByHeight();
		System.out.println("After sorting plants by height:");
		forestNotebook.PrintNotebook();

		// Number of animals in the book
		System.out.println("Number of animals in the book: " + forestNotebook.getAnimalCount());

		// Number of plants in the book
		System.out.println("Number of plants in the book: " + forestNotebook.getPlantCount());
		
		// Checking if duplicate elements are allowed
		forestNotebook.addAnimal(chita);
		forestNotebook.addPlant(grass);
				
	}

}
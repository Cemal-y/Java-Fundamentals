package be.intecbrussel.service;
import java.util.Comparator;

import be.intecbrussel.entities.animal_entities.Animal;

public class AnimalsByHeightComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal animal1, Animal animal2) {		
		if (animal1.getHeight() < animal2.getHeight()) return -1;
        if (animal1.getHeight() > animal2.getHeight()) return 1;
        return 0;
		
	}

	}

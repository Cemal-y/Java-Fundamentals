package be.intecbrussel.service;

import java.util.Comparator;

import be.intecbrussel.entities.plant_entities.*;

public class PlantsByHeightComparator implements Comparator<Plant>{

	@Override
	public int compare(Plant plant1, Plant plant2) {
		if (plant1.getHeight() < plant2.getHeight()) return -1;
        if (plant1.getHeight() > plant2.getHeight()) return 1;
        return 0;
	}

}

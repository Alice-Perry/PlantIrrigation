package com.company;
import java.util.ArrayList;

public class LookUpListOfPlants {
    ArrayList<Plant> lookUpListOfPlants = new ArrayList<Plant>();

    public LookUpListOfPlants() {
        lookUpListOfPlants.add(new Plant("Aloe" , 1, 1));
        lookUpListOfPlants.add(new Plant("Amaryllis" , 2, 2));
        lookUpListOfPlants.add(new Plant("Azalea" , 3, 3));
        lookUpListOfPlants.add(new Plant("Bougainvilles" , 3, 3));
        lookUpListOfPlants.add(new Plant("Buxus" , 2, 1));
        lookUpListOfPlants.add(new Plant("Orchid" , 1, 2));
    }

    public Plant findPlant(String plantType) {
        for (Plant plant : lookUpListOfPlants) {
            if (plant.getPlantType().equalsIgnoreCase(plantType)) {
                return plant;
            }
        }
        return null;
    }
}

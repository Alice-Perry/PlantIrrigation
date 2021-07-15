package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PlantFactory factory = new PlantFactory();
        LookUpListOfPlants lookUpListOfPlants = new LookUpListOfPlants();
        Plant plant = factory.createNewPlant(lookUpListOfPlants);

        AmountOfWaterCalculator amountOfWaterCalculator = new AmountOfWaterCalculator();
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        WaterGiver waterGiver = new WaterGiver(amountOfWaterCalculator , frequencyCalculator);

        amountOfWaterCalculator.getAmountOfWaterToGive(plant);

        lookUpListOfPlants.findPlant(plant.getPlantType());

        if (waterGiver.needsWater(plant)){
                waterGiver.giveWater(plant);
        }

        System.out.println(factory.displayPlantDetails(plant, frequencyCalculator, amountOfWaterCalculator, waterGiver));
    }
}

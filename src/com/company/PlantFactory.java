package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlantFactory {

    public Plant createNewPlant(LookUpListOfPlants lookUpListOfPlants) {
    Scanner scanner = new Scanner(System.in);
    String plantType = getPlantType(scanner);

    Plant plant = lookUpListOfPlants.findPlant(plantType);
        if (plant !=null) {
        return plant;
    }

    int moistureLevel = getMoistureLevel(scanner);
    int specialNeeds = getSpecialNeeds(scanner);

        return new Plant(plantType, moistureLevel, specialNeeds);
}

    private String getPlantType(Scanner scanner) {
        System.out.println("What is the type of plant?");
        return scanner.nextLine();
    }

    private int getMoistureLevel(Scanner scanner) {
        int moistureLevel;
        do {
            System.out.println("What is the moisture level for this plant?\n" +
                    "Please enter 1 for very dry soil.\n" +
                    "Enter 2 for dry soil.\n" +
                    "Enter 3 for normal soil.\n" +
                    "Enter 4 for wet soil.\n" +
                    "Enter 5 for very wet soil.");
            moistureLevel = scanner.nextInt();
        } while (moistureLevel == 0);
        return moistureLevel;
    }

    private int getSpecialNeeds(Scanner scanner) {
        int specialNeeds;
        do{
            System.out.println("What are the special needs for this plant?\n" +
                    "Please enter 1 for more frequent, small amounts of water.\n" +
                    "Enter 2 to allow soil to dry out in between watering.\n" +
                    "Enter 3 to give less frequent, one amount of water." );
            specialNeeds = scanner.nextInt();
        } while (specialNeeds == 0);
        return specialNeeds;
    }

    public String displayPlantDetails(Plant plant , FrequencyCalculator frequencyCalculator , AmountOfWaterCalculator amountOfWaterCalculator , WaterGiver waterGiver) {
        return
         "\nPLANT\n" +
          "Name: " + plant.getPlantType() + ".\n" +
          "Moisture level: " + plant.moistureLevelToString(plant.getMoistureLevel()) +".\n" +
          "Special needs: " + plant.specialNeedsToString(plant.getSpecialNeeds()) + ".\n" +
          "Your plant will be watered " + amountOfWaterCalculator.getAmountOfWaterToGive(plant) + " milliliter for every "
                     + frequencyCalculator.calculateFrequency(plant) + " hours" + ".\n" +
          "Your next watering will be in: " + (frequencyCalculator.getNextWatering(plant)/24) + " days and " + + (frequencyCalculator.getNextWatering(plant)/24) + " hours" + ".\n" +
          "The water container still contains "  + waterGiver.reservoir + " milliliter of water" + ".\n" +
          "It needs a refill in "  + waterGiver.getEmptyInHours(plant)+ " days.";
    }
}

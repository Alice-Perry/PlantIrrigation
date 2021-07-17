package com.company;

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
        System.out.println("Welcome to GreenLeaf Watering Systems.\n" +
                "The perfect solution for watering your plant.\n" +
                "What is the type of your plant?");
        return scanner.nextLine();
    }

    private int getMoistureLevel(Scanner scanner) {
        int moistureLevel;
        System.out.println("What is the moisture level for this plant?\n" +
            "For the correct level for your plant, please check it's label or visit www.greenleaf.com.\n" +
            "Please enter 1 for very dry soil.\n" +
            "Enter 2 for dry soil.\n" +
            "Enter 3 for normal soil.\n" +
            "Enter 4 for wet soil.\n" +
            "Enter 5 for very wet soil.");
        moistureLevel = scanner.nextInt();
            if(moistureLevel <= 0 || moistureLevel> 5) {
                System.out.println("That is not a legal input. Please enter 1, 2, 3, 4 or 5.");
                getMoistureLevel(scanner);
            }
        return moistureLevel;
    }

    private int getSpecialNeeds(Scanner scanner) {
        int specialNeeds;
        System.out.println("What are the special needs for this plant?\n" +
            "For the correct special needs for your plant, please check it's label or visit www.greenleaf.com.\n" +
            "Please enter 1 for more frequent, small amounts of water.\n" +
            "Enter 2 to allow soil to dry out in between watering.\n" +
            "Enter 3 to give less frequent, one amount of water.");
        specialNeeds = scanner.nextInt();
            if (specialNeeds <= 0 || specialNeeds > 3) {
                System.out.println("That is not a legal input. Please enter 1, 2 or 3.");
                getSpecialNeeds(scanner);
            }
        return specialNeeds;
    }

    public String displayPlantDetails(Plant plant , FrequencyCalculator frequencyCalculator , AmountOfWaterCalculator amountOfWaterCalculator , WaterGiver waterGiver) {
        long hoursBeforeWatering = frequencyCalculator.calculateFrequency(plant);
        long nextWateringDays = hoursBeforeWatering / 24;
        long nextWateringHours =  hoursBeforeWatering % 24;

        return
         "\n\nGREENLEAF WATERING SYSTEMS IS WORKING FOR YOU. \n\n" +
          "Name: " + plant.getPlantType() + ".\n" +
          "Moisture level: " + plant.moistureLevelToString(plant.getMoistureLevel()) +".\n" +
          "Special needs: " + plant.specialNeedsToString(plant.getSpecialNeeds()) + ".\n" +
          "Your plant will be watered " + amountOfWaterCalculator.getAmountOfWaterToGive(plant) + " milliliter for every "
                     + frequencyCalculator.calculateFrequency(plant) + " hours" + ".\n" +
          "Your next watering will be in: " + nextWateringDays + " days and " + nextWateringHours + " hours" + ".\n" +
         displayDetailsAfterWatering(plant, waterGiver);
    }

    public String displayDetailsAfterWatering(Plant plant , WaterGiver waterGiver){
        return
         "The water container now contains "  + waterGiver.reservoir + " milliliter of water" + ".\n" +
         "It needs a refill in "  + waterGiver.getEmptyInHours(plant)+ " days.";
    }
}

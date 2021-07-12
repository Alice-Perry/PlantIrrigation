package com.company;

import java.util.Scanner;

public class PlantFactory {
    FrequencyCalculator frequencyCalculator;
    AmountOfWaterCalculator amountOfWaterCalculator;

   // public PlantFactory(FrequencyCalculator frequencyCalculator, MoistureLevelCalculator moistureLevelCalculator){
    //    this.frequencyCalculator = frequencyCalculator;
   //     this. moistureLevelCalculator = moistureLevelCalculator;
    //    }

    public Plant createNewPlant(ListOfPlants listOfPlants) {
        Scanner scanner = new Scanner(System.in);
        String plantType = getPlantType(scanner);
        Plant plant = listOfPlants.findPlant(plantType);
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
}

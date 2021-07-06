package com.company;

public class Main {

    public static void main(String[] args) {
        //MoistMeter moistMeter = new MoistMeter();

        PlantFactory factory = new PlantFactory();
        ListOfPlants listOfPlants = new ListOfPlants();
        Plant plant = factory.createNewPlant(listOfPlants);

        MoistureLevelCalculator moistureLevelCalculator = new MoistureLevelCalculator(plant);
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator(moistureLevelCalculator.amountOfWaterToGive, moistureLevelCalculator.hoursBeforeWateringAgain);
        WaterGiver watergiver = new WaterGiver(plant);

        listOfPlants.getListOfPlants();
        listOfPlants.findPlant(plant.getPlantType());
        //listOfPlants.displayArrayListOfPlants();

        watergiver.waterGiverTimer();


        System.out.println(plant.displayPlantDetails());
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        //MoistMeter moistMeter = new MoistMeter();

        PlantFactory factory = new PlantFactory();
        ListOfPlants listOfPlants = new ListOfPlants();
        Plant plant = factory.createNewPlant(listOfPlants);

        FrequencyCalculator frequencyCalculator = new FrequencyCalculator(plant);
        MoistureLevelCalculator moistureLevelCalculator = new MoistureLevelCalculator();

        WaterGiver watergiver = new WaterGiver(plant);

        frequencyCalculator.getHoursBeforeWateringAgain();
        moistureLevelCalculator.getAmountOfWaterToGive(plant);

        listOfPlants.getListOfPlants();
        listOfPlants.findPlant(plant.getPlantType());
        //listOfPlants.displayArrayListOfPlants();

        watergiver.waterGiverTimer();


        System.out.println(plant.displayPlantDetails(frequencyCalculator));
    }

}

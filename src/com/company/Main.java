package com.company;

public class Main {

    public static void main(String[] args) {
        //MoistMeter moistMeter = new MoistMeter();

        PlantFactory factory = new PlantFactory();
        ListOfPlants listOfPlants = new ListOfPlants();
        Plant plant = factory.createNewPlant(listOfPlants);

        //FrequencyCalculator frequencyCalculator = new FrequencyCalculator(plant);
        AmountOfWaterCalculator amountOfWaterCalculator = new AmountOfWaterCalculator();

        WaterGiver watergiver = new WaterGiver();

        //frequencyCalculator.getHoursBeforeWateringAgain();
        amountOfWaterCalculator.getAmountOfWaterToGive(plant);

        listOfPlants.getListOfPlants();
        listOfPlants.findPlant(plant.getPlantType());
        //listOfPlants.displayArrayListOfPlants();

        watergiver.waterGiverTimer();


        System.out.println(plant.displayPlantDetails());
    }

}

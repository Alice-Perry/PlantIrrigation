package com.company;

public class Main {

    public static void main(String[] args) {

        PlantFactory factory = new PlantFactory();
        ListOfPlants listOfPlants = new ListOfPlants();
        Plant plant = factory.createNewPlant(listOfPlants);

        AmountOfWaterCalculator amountOfWaterCalculator = new AmountOfWaterCalculator();
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        WaterGiver waterGiver = new WaterGiver(amountOfWaterCalculator , frequencyCalculator);

        amountOfWaterCalculator.getAmountOfWaterToGive(plant);

        listOfPlants.getListOfPlants();
        listOfPlants.findPlant(plant.getPlantType());
        //listOfPlants.displayArrayListOfPlants();

        for (Plant p : listOfPlants.getListOfPlants()) {
            if (waterGiver.needsWater(p)){
                waterGiver.giveWater(p);
            }
        }

        System.out.println(factory.displayPlantDetails(plant, frequencyCalculator, amountOfWaterCalculator, waterGiver));
    }

}

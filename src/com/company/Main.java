package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static Timer timer;

    public static void main(String[] args) {

        PlantFactory factory = new PlantFactory();
        LookUpListOfPlants lookUpListOfPlants = new LookUpListOfPlants();

        Plant plant = factory.createNewPlant(lookUpListOfPlants);

        AmountOfWaterCalculator amountOfWaterCalculator = new AmountOfWaterCalculator();
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        WaterGiver waterGiver = new WaterGiver(amountOfWaterCalculator , frequencyCalculator);

        timer = new Timer();
        TimerTask task = createWateringTask(waterGiver, plant);
        timer.scheduleAtFixedRate(task, 0, 1000);

        System.out.println(factory.displayPlantDetails(plant, frequencyCalculator, amountOfWaterCalculator, waterGiver));
    }

    public static TimerTask createWateringTask (WaterGiver waterGiver, Plant plant) {
        return new TimerTask() {
            public void run() {
                System.out.print(".");

                if (waterGiver.needsWater(plant)) {
                    System.out.println("\nThe plant will now be watered.");
                    waterGiver.giveWater(plant);
                    //timer.cancel();
                }
            }
        };
    }
}

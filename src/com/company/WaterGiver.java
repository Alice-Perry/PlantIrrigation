package com.company;

import java.time.LocalDateTime;

public class WaterGiver {
    private AmountOfWaterCalculator amountOfWaterCalculator;
    private FrequencyCalculator frequencyCalculator;
    int reservoir = 3000;
    int emptyInHours;


    public WaterGiver(AmountOfWaterCalculator amountOfWaterCalculator, FrequencyCalculator frequencyCalculator) {
        this.amountOfWaterCalculator = amountOfWaterCalculator;
        this.frequencyCalculator = frequencyCalculator;
    }

    public int getAmountOfWaterToGive(Plant plant) {
       return amountOfWaterCalculator.getAmountOfWaterToGive(plant);
    }

    public boolean needsWater(Plant plant) {
        long hoursBeforeWateringAgain = frequencyCalculator.getNextWatering(plant);
        boolean needsWater;
        if (hoursBeforeWateringAgain == 0) {
            needsWater = true;
            System.out.println("Your plant needs water.");
        }
        else{
            needsWater = false;
            System.out.println("Your plant does not need water.");
        }
        return needsWater;
    }

    public void giveWater(Plant plant){
        reservoir = reservoir - getAmountOfWaterToGive(plant);
        plant.setLastTimePlantWasWatered(LocalDateTime.now());
    }

    public int getEmptyInHours(Plant plant) {
        int amount = getAmountOfWaterToGive(plant);
        int time = frequencyCalculator.calculateFrequency(plant);

        return ((reservoir / amount) * (time / 24)) + (time/24);
    }

    public void setEmptyInHours(int empty){
        this.emptyInHours = empty;
    }
}

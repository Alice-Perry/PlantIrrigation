package com.company;

public class MoistureLevelCalculator {
    double multiplier;
    int amountOfWaterToGive;
    int measuredMoistInPercent;
    int minMoistLevel;
    int hoursBeforeWateringAgain;

    public int getFrequency(FrequencyCalculator frequencyCalculator){
        hoursBeforeWateringAgain = frequencyCalculator.getHoursBeforeWateringAgain();
        return  hoursBeforeWateringAgain;
    }

    public double getAmountOfWaterToGive (Plant plant) {
        switch (plant.getMoistureLevel()) {
            case 1 -> {
                minMoistLevel = 5;
                amountOfWaterToGive = 1;
                multiplier = 10;
            }
            case 2 -> {
                minMoistLevel = 25;
                amountOfWaterToGive = 5;
                multiplier = 5;
            }
            case 3 -> {
                minMoistLevel = 50;
                amountOfWaterToGive = 25;
                multiplier = 4;
            }
            case 4 -> {
                minMoistLevel = 65;
                amountOfWaterToGive = 50;
                multiplier = 3;
            }
            case 5 -> {
                minMoistLevel = 85;
                amountOfWaterToGive = 150;
                multiplier = 2.3;
            }
            default -> System.exit(0);
        }

        if (hoursBeforeWateringAgain > 24) {
            return amountOfWaterToGive *= multiplier;
        }
        else {
            return amountOfWaterToGive;
        }
    }

    public int getMinMoistLevel (Plant plant) {
        switch (plant.getMoistureLevel()) {
            case 1 -> {
                minMoistLevel = 5;
            }
            case 2 -> {
                minMoistLevel = 25;
            }
            case 3 -> {
                minMoistLevel = 50;
            }
            case 4 -> {
                minMoistLevel = 65;
            }
            case 5 -> {
                minMoistLevel = 85;
            }
            default -> System.exit(0);
        }
        return minMoistLevel;
    }
    public int getMeasuresMoistInPercent(MoistMeter moistMeter){
        measuredMoistInPercent = moistMeter.getMeasuredMoistInPercent();
        return measuredMoistInPercent;
    }
}

package com.company;

public class AmountOfWaterCalculator {
    int multiplier;
    int amountOfWaterToGive;
    int minMoistLevel;
    int hoursBeforeWateringAgain; // DEZE MOET NOG UITGEREKEND. GEEN IDEE HOE!

    public int getAmountOfWaterToGive (Plant plant) {
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
                multiplier = 2;
            }
            default -> amountOfWaterToGive = 80;
        }

        if (hoursBeforeWateringAgain > 24) {
            return amountOfWaterToGive *= multiplier;
        }
        else {
            return amountOfWaterToGive;
        }
    }
}

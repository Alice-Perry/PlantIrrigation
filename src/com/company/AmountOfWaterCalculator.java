package com.company;

public class AmountOfWaterCalculator {
    int multiplier;
    int amountOfWaterToGive;
    int hoursBeforeWateringAgain;

    public int getAmountOfWaterToGive (Plant plant) {
        switch (plant.getMoistureLevel()) {
            case 1 -> {
                amountOfWaterToGive = 150;
                multiplier = 3;
            }
            case 2 -> {
                amountOfWaterToGive = 150;
                multiplier = 4;
            }
            case 3 -> {
                amountOfWaterToGive = 300;
                multiplier = 2;
            }
            case 4 -> {
                amountOfWaterToGive = 350;
                multiplier = 2;
            }
            case 5 -> {
                amountOfWaterToGive = 350;
                multiplier = 3;
            }
            default -> amountOfWaterToGive = 300;
        }

        if (hoursBeforeWateringAgain > 50) {
            return amountOfWaterToGive *= multiplier;
        }
        else {
            return amountOfWaterToGive;
        }
    }
}

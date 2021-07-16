package com.company;

public class AmountOfWaterCalculator {
    private int multiplier;
    private int amountOfWaterToGive;
    int hoursBeforeWateringAgain;

    public int getAmountOfWaterToGive (Plant plant) {
        switch (plant.getMoistureLevel()) {
            case 1 -> {
                amountOfWaterToGive = 50;
                multiplier = 3;
            }
            case 2 -> {
                amountOfWaterToGive = 100;
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

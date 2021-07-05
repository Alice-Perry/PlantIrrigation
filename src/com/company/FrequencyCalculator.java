package com.company;

public class FrequencyCalculator {
    private double amountOfWaterToGive;
    private double hoursBeforeWateringAgain;

    public FrequencyCalculator(double amount, double hours) {
        amountOfWaterToGive = amount;
        hoursBeforeWateringAgain = hours;
    }

    public void setAmountOfWaterToGive(int amount){
        amountOfWaterToGive = amount;
    }

    public double getAmountOfWaterToGive(){
        return amountOfWaterToGive;
    }

    public void setHoursBeforeWateringAgain(int hours){
        hoursBeforeWateringAgain = hours;
    }
    public double getHoursBeforeWateringAgain(){
        return hoursBeforeWateringAgain;
    }

    //return new FrequencyCalculator(amountOfWaterToGive, hoursBeforeWateringAgain);

}
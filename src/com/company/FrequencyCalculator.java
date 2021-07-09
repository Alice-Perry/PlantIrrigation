package com.company;

public class FrequencyCalculator {
    private int hoursBeforeWateringAgain;
    private MoistMeter moistmeter;
    private Plant plant;

    public FrequencyCalculator(Plant plant) {
        if(plant.getSpecialNeeds() == 1) {
            hoursBeforeWateringAgain = 6;
        }
        else if (plant.getSpecialNeeds() == 2) {
            hoursBeforeWateringAgain = 24;
        }
        else {
            hoursBeforeWateringAgain = 48;
        }
    }

       public int getHoursBeforeWateringAgain(){
        return hoursBeforeWateringAgain;
    }

    public  boolean minMoistCalculator(MoistureLevelCalculator moistureLevelCalculator) {
        int minimum = moistureLevelCalculator.getMeasuresMoistInPercent(moistmeter);
        boolean turnWaterOn;
        if (moistureLevelCalculator.getMinMoistLevel(plant) == minimum) {
            return turnWaterOn = true;
        }
        else{
            return turnWaterOn = false;
        }
    }

}
package com.company;

public class FrequencyCalculator {
    private int hoursBeforeWateringAgain;

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
}
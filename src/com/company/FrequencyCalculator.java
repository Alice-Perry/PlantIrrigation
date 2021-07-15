package com.company;

import java.time.Duration;
import  java.time.LocalDateTime;

public class FrequencyCalculator {
    private int hoursBeforeWateringAgain;

    public int calculateFrequency(Plant plant) {
        if (plant.getSpecialNeeds() == 1) {
            hoursBeforeWateringAgain = 24;
        } else if (plant.getSpecialNeeds() == 2) {
            hoursBeforeWateringAgain = 50;
        } else {
            hoursBeforeWateringAgain = 96;
        }
        return hoursBeforeWateringAgain;
    }

    public long getNextWatering(Plant plant) {
        int frequency = hoursBeforeWateringAgain;
        long hours = Duration.between(plant.getLastTimePlantWasWatered(), LocalDateTime.now()).toHours();

        return frequency - hours;
    }
}


package com.company;

import java.time.Duration;
import  java.time.LocalDateTime;

public class FrequencyCalculator {
    private int hoursBeforeWateringAgain;

    public int calculateFrequency(Plant plant) {
        if (plant.getSpecialNeeds() == 1) {
            hoursBeforeWateringAgain = 6;
        } else if (plant.getSpecialNeeds() == 2) {
            hoursBeforeWateringAgain = 24;
        } else {
            hoursBeforeWateringAgain = 48;
        }
        return hoursBeforeWateringAgain;
    }

    public long getNextWatering(Plant plant) {
        int frequency = hoursBeforeWateringAgain;
        long hours = Duration.between(plant.getLastTimePlantWasWatered(), LocalDateTime.now()).toHours();
        long hoursBeforeWateringAgain = frequency - hours;

        return hoursBeforeWateringAgain;
    }
}


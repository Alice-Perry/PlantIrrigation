package com.company;

import java.time.Duration;
import  java.time.LocalDateTime;

public class FrequencyCalculator {
    private int wateringFrequency;

    public int calculateFrequency(Plant plant) {
        if (plant.getSpecialNeeds() == 1) {
            wateringFrequency = 24;
        } else if (plant.getSpecialNeeds() == 2) {
            wateringFrequency = 50;
        } else {
            wateringFrequency = 96;
        }
        return wateringFrequency;
    }

    public long getNextWatering(Plant plant) {
        int frequency = wateringFrequency;
        long hours = Duration.between(plant.getLastTimePlantWasWatered(), LocalDateTime.now()).toSeconds(); // Seconden ipv uren, anders moeten we zo lang wachten.

        return frequency - hours;
    }
}


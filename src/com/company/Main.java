package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        //MoistMeter moistMeter = new MoistMeter();

        PlantFactory factory = new PlantFactory();
        Plant plant = factory.createNewPlant();
        WaterGiver watergiver = new WaterGiver(plant);
        watergiver.waterGiverTimer();

        //voor iedere 20 seconden if moistmeter = check plant.waterlevel
        //    loopje elke 10 sec kijkt ie of het moisturelevel
        //        loopje met sleep.
        System.out.println(plant.displayPlantDetails());
    }

}

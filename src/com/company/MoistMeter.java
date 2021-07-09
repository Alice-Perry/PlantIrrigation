package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class MoistMeter {
    private int min = 5;
    private int max = 95;
    private Plant plant;
    private int measuredMoistInPercent = (int)(Math.random()*(max-min+1)+min);
    private int minimumMoistInPercent;

    public int getMeasuredMoistInPercent() {
        return measuredMoistInPercent;
    }

    public  int getMinimumMoistInPercent(MoistureLevelCalculator moistureLevelCalculator){
        minimumMoistInPercent = moistureLevelCalculator.getMinMoistLevel(plant);
        return minimumMoistInPercent;
    }

    public int decreaseMoistLevel(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            public void run() {
                do {
                    measuredMoistInPercent--;
                }
                while(measuredMoistInPercent >= minimumMoistInPercent);
                }
        };
        return measuredMoistInPercent;
    }
}
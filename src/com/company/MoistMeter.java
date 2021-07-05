package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class MoistMeter
{
    int min = 10;
    int max = 80;
    private int measuredMoistInPercent = (int)(Math.random()*(max-min+1)+min);
    private int minimumMoistInPercent = 20;
    public boolean turnWaterOn = false;


    public int getMeasuredMoistInPercent() {
        return measuredMoistInPercent;
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

    public int getMinimumMoistInPercent(){
        return minimumMoistInPercent;
    }
    public boolean turnWaterOn() {
        if (measuredMoistInPercent <= minimumMoistInPercent) {
            turnWaterOn = true;
        }
        else{
            turnWaterOn = false;
        }
        return turnWaterOn;

    }
}
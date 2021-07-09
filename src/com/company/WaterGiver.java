package com.company;
import java.util.Timer;
import java.util.TimerTask;

public class WaterGiver {
    private Plant plant;
    private int waterRefill;
    private MoistMeter moistMeter = new MoistMeter();
    private MoistureLevelCalculator MLC;
    private int decreaser = moistMeter.decreaseMoistLevel();
    private int minimum = moistMeter.getMinimumMoistInPercent(MLC);
    private boolean turnWaterOn = false;
    private int measuredMoistInPercent = MLC.getMeasuresMoistInPercent(moistMeter);

    public WaterGiver(Plant plant) {
        this.plant = plant;
    }

    public void waterGiverTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        public void run() {
            //FrequencyCalculator frequencyCalculator = frequencyCalculator.getAmountOfWaterToGive();
            if (decreaser > minimum) {
                System.out.println("The moist percentage of your plant soil is " + decreaser + "%.");
            } else {
                System.out.println("The plant will now be watered.");
                //System.out.println("Next watering moment wil be in " + frequencyCalculator.getAmountOfWaterToGive() + " hours.");
                timer.cancel();
            }
            decreaser--;
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    public boolean turnWaterOn() {
        if (measuredMoistInPercent <= minimum) {
            turnWaterOn = true;
        }
        else{
            turnWaterOn = false;
        }
        return turnWaterOn;
    }

    //public int getWaterRefill(){

    //}
}

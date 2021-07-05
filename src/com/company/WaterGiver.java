package com.company;
import java.util.Timer;
import java.util.TimerTask;

public class WaterGiver {
    Plant plant;
    MoistMeter moistMeter = new MoistMeter();

    public WaterGiver(Plant plant) {
        this.plant = plant;
    }

    public void waterGiverTimer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private int decreaser = moistMeter.decreaseMoistLevel();
            private int minimum = moistMeter.getMinimumMoistInPercent();

            public void run() {
               if (decreaser > minimum) {
                   System.out.println("The moist percentage of your plant soil is " + decreaser + "%.");
               }
               else{
                   System.out.println("The plant will now be watered.");
                   timer.cancel();

               }
               decreaser--;

           }
       };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

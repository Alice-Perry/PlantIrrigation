import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
    }


        public void HoursBeforeWateringAgain() {
            int hours = hoursBeforeWateringAgain;
            try {
                TimeUnit.HOURS.sleep(hours);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong." + e);
            }
        }

        public int DaysOnVacationInput() {
            System.out.println("How many days will you be on vacation?");
            Scanner keyboard = new Scanner(System.in);
            int daysOnVacation = keyboard.nextInt();
            keyboard.close();
            return daysOnVacation;
        }

        private int amountOfWaterToGive = 50; // in ml
        private int daysOfWatering = 1;
        private int flowPerMinuteInMilliliter = 10;
        private int flowMeter = 0;
        private boolean openValve = false;

        public void GiveWater() {
            for (int i = daysOfWatering; i < DaysOnVacationInput(); i++) {
                openValve = true;
                flowMeter = flowMeter + flowPerMinuteInMilliliter;
                if (flowMeter >= amountOfWaterToGive) {
                    openValve = false;
                    System.out.println(amountOfWaterToGive + " ml water has been given to your plant.");
                    System.out.println("Next watering will be in 24 hours.");
                    daysOfWatering++;
                    HoursBeforeWateringAgain();
                }
            }
        }
    
}

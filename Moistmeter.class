public class MoistMeter 
{
    int min = 0;  
    int max = 100; 
    private int measuredMoistInProcent = (int)(Math.random()*(max-min+1)+min);
    private double minimumMoistInProcent = 25;
    private boolean turnWaterOn = false;

    public boolean turnWaterOn()
    {
        if (measuredMoistInProcent <= minimumMoistInProcent)
        {
            turnWaterOn = true;
        }
        return turnWaterOn;
    }
}
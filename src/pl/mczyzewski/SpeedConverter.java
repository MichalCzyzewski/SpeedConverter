package pl.mczyzewski;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0){
            return -1;
        }
        else {

            return (long)Math.round(kilometersPerHour);
        }
    }

    public static

}

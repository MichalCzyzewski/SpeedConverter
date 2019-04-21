package pl.mczyzewski;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            double milesPerHouer =  kilometersPerHour / 1.609;
            return (long)Math.round(milesPerHouer);
        }
    }

    public static void printConvesion (double kilometersPerHour)
    {
        System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
    }

}

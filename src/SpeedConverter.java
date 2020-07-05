public class SpeedConverter {

    /**
     * This method calculates the speed conversions from kilometersPerHour to milesPerHour.
     * @param kilometersPerHour
     * @return
     */
    public static long toMilesPerHour(double kilometersPerHour){
        double converter= 0.621371;
        if (kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    /**
     * This method prints the values of the above converted method.
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour){
      if(kilometersPerHour<0){
          System.out.println("Invalid value");
      }
      else {
          long milesPerHour = toMilesPerHour(kilometersPerHour);
          System.out.println(kilometersPerHour +
                  " km/h= " + milesPerHour +
                  " mi/h");

      }

    }


}

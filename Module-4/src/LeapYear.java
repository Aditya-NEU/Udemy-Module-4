public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999 && year%4==0 && year%100==0 && year%400==0){
            System.out.println(true);
        }
        else
            System.out.println(false);
        return false;
    }
}

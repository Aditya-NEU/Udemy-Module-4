public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int constant= 1024;
            int megaByte= kiloBytes/constant;
            int kiloByte= kiloBytes%constant;
            System.out.println(kiloBytes +" KB"+"=" + megaByte +" MB"+ " and "+ kiloByte +" KB");

    }

}

package ex1;

public class Notendurchschnitt {
    public static double calculatedurchs(int[] noten){
        int s = 0;
        for (int note:noten){
            s+=note;
        }
        return (double) s / noten.length;
    }
}

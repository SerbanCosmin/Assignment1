package ex1;

import java.util.List;

public class MaxAbgerundete {
    public static int getmaxAbgerundete(int[] noten) {
        List<Integer> abgerNoten = Abrundung.abrundenoten(noten);
        int max = abgerNoten.get(0);
        for (int note:abgerNoten) { //vielleicht besser sortiert und index 0 ???
            if (max < note){
                max = note;
            }
        }
        return max;
    }
}

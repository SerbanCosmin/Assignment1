package ex1;

import java.util.ArrayList;
import java.util.List;

public class NichtausreichendFilter {
    public static List<Integer> getnichtausr(int[] noten) {
        List<Integer> nichtausr = new ArrayList<>();
        for(int note:noten){
            if (note < 40) {
                nichtausr.add(note);
            }
        }
        return nichtausr;
    }
}

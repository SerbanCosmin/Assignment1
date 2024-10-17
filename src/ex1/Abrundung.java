package ex1;

import java.util.ArrayList;
import java.util.List;

public class Abrundung {
    public static List<Integer> abrundenoten(int[] noten){
        List<Integer> abgernoten = new ArrayList<>();
        for(int i =0;i<noten.length;i++){
            int note=noten[i];
            if (note>=38){
                switch (5-(note%5)){
                    case 1:
                        abgernoten.add(note+1);
                        break;
                    case 2:
                        abgernoten.add(note+2);
                        break;
                    default:
                        abgernoten.add(note);
                        break;
                }
            } else abgernoten.add(note);
        }
        return abgernoten;
    }
}

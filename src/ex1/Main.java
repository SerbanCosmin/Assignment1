package ex1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] noten = {84, 29, 57, 68, 38, 94};

//         Aufgabe 1: Nicht ausreichende Noten
        List<Integer> nichtAusreichende = NichtausreichendFilter.getnichtausr(noten);
        System.out.println("Nicht ausreichende Noten: " + nichtAusreichende);

        // Aufgabe 2: Durchschnittswert berechnen
        double durchschnitt = Notendurchschnitt.calculatedurchs(noten);
        System.out.println("Durchschnittswert: " + durchschnitt);

        // Aufgabe 3: Noten abrunden
        List<Integer> abgerundeteNoten = Abrundung.abrundenoten(noten);
        System.out.print("Abgerundete Noten: ");
        for (int note : abgerundeteNoten) {
            System.out.print(note + " ");
        }
        System.out.println();

        // Aufgabe 4: Maximale abgerundete Note
        int maxAbgerundeteNote = MaxAbgerundete.getmaxAbgerundete(noten);
        System.out.println("Maximale abgerundete Note: " + maxAbgerundeteNote);
    }
}
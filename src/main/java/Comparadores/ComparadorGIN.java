package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorGIN implements Comparator<Inversionista> {
    @Override
    public int compare(Inversionista inversionista1, Inversionista inversionista2){
        if (inversionista1.ganancias < inversionista2.ganancias){
            return -1;
        } else if (inversionista1.ganancias == inversionista2.ganancias){
            return 0;
        } else {
            return 1;
        }
    }
}

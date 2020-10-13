package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorINsede implements Comparator<Inversionista> {
    @Override
    public int compare(Inversionista inversionista1, Inversionista inversionista2){
        if (inversionista1.inversionSede < inversionista2.inversionSede){
            return -1;
        } else if (inversionista1.inversionSede == inversionista2.inversionSede){
            return 0;
        } else {
            return 1;
        }
    }
}

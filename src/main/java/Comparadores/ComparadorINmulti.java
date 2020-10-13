package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorINmulti implements Comparator<Inversionista> {
    @Override
    public int compare(Inversionista inversionista1, Inversionista inversionista2){
        if (inversionista1.inversionMN < inversionista2.inversionMN){
            return -1;
        } else if (inversionista1.inversionMN == inversionista2.inversionMN){
            return 0;
        } else {
            return 1;
        }
    }
}

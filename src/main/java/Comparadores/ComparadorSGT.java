package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorSGT implements Comparator<Sede> {
    @Override
    public int compare(Sede sede1, Sede sede2){
        if (sede1.gastosSede < sede2.gastosSede){
            return -1;
        } else if (sede1.gastosSede == sede2.gastosSede){
            return 0;
        } else {
            return 1;
        }
    }
}
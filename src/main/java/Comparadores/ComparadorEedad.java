package Comparadores;

import java.util.Comparator;
import Clases.*;

public class ComparadorEedad implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        if (empleado1.edad < empleado2.edad){
            return -1;
        } else if (empleado1.edad == empleado2.edad){
            return 0;
        } else {
            return 1;
        }
    }
}
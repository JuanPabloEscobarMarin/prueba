package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorEcedula implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        if (empleado1.cedula < empleado2.cedula){
            return -1;
        } else if (empleado1.cedula == empleado2.cedula){
            return 0;
        } else {
            return 1;
        }
    }
}

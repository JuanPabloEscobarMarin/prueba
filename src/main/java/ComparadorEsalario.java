import java.util.Comparator;
import Clases.*;
public class ComparadorEsalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        if (empleado1.salario < empleado2.salario){
            return -1;
        } else if (empleado1.salario == empleado2.salario){
            return 0;
        } else {
            return 1;
        }
    }
}
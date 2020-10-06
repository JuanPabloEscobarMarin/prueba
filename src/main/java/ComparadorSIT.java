import java.util.Comparator;
import Clases.*;
public class ComparadorSIT implements Comparator<Sede> {
    @Override
    public int compare(Sede sede1, Sede sede2){
        if (sede1.ingresoSede < sede2.ingresoSede){
            return -1;
        } else if (sede1.ingresoSede == sede2.ingresoSede){
            return 0;
        } else {
            return 1;
        }
    }
}
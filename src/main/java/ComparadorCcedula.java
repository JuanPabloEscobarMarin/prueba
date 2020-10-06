import java.util.Comparator;
import Clases.*;
public class ComparadorCcedula implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2){
        if (cliente1.cedula < cliente2.cedula){
            return -1;
        } else if (cliente1.cedula == cliente2.cedula){
            return 0;
        } else {
            return 1;
        }
    }
}
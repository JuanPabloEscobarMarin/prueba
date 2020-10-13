package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorCdinero implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2){
        if (cliente1.dinero < cliente2.dinero){
            return -1;
        } else if (cliente1.dinero == cliente2.dinero){
            return 0;
        } else {
            return 1;
        }
    }
}

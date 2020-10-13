package Comparadores;

import java.util.Comparator;
import Clases.*;
public class ComparadorM implements Comparator<Multinacional> {
    @Override
    public int compare(Multinacional multinacional1, Multinacional multinacional2){
        if (multinacional1.NIT < multinacional2.NIT){
            return -1;
        } else if (multinacional1.NIT == multinacional2.NIT){
            return 0;
        } else {
            return 1;
        }
    }

}

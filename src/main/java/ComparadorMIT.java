import java.util.Comparator;
import Clases.*;
    public class ComparadorMIT implements Comparator<Multinacional> {
        @Override
        public int compare(Multinacional multinacional1, Multinacional multinacional2){
            if (multinacional1.ingresoTotal < multinacional2.ingresoTotal){
                return -1;
            } else if (multinacional1.ingresoTotal == multinacional2.ingresoTotal){
                return 0;
            } else {
                return 1;
            }
        }
    }

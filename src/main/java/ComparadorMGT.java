import java.util.Comparator;
import Clases.*;

public class ComparadorMGT implements Comparator<Multinacional> {
    @Override
    public int compare(Multinacional multinacional1, Multinacional multinacional2){
        if (multinacional1.gastoTotal < multinacional2.gastoTotal){
            return -1;
        } else if (multinacional1.gastoTotal == multinacional2.gastoTotal){
            return 0;
        } else {
            return 1;
        }
    }
}

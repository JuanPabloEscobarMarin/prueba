import java.util.Comparator;
import Clases.*;
public class ComparadorIarea implements Comparator<Area> {
    @Override
    public int compare(Area area1, Area area2){
        if (area1.ingresoArea < area2.ingresoArea){
            return -1;
        } else if (area1.ingresoArea == area2.ingresoArea){
            return 0;
        } else {
            return 1;
        }
    }
}

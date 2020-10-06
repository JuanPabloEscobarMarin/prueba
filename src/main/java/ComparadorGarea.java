import java.util.Comparator;
import Clases.*;
public class ComparadorGarea implements Comparator<Area> {
    @Override
    public int compare(Area area1, Area area2){
        if (area1.gastoArea < area2.gastoArea){
            return -1;
        } else if (area1.gastoArea == area2.gastoArea){
            return 0;
        } else {
            return 1;
        }
    }
}

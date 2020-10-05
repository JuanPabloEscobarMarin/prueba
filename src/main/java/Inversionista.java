import java.util.ArrayList;

public class Inversionista {

    public String firma;
    public int ganancias;
    public  int inversionSede;
    public ArrayList<Sede> sedes;
    public ArrayList<Multinacional> multinacional;
    public  int inversionMN;

    public Inversionista(String firma, int inversionMN,int inversionSede,int ganancias) {
        this.firma =firma ;
        this.ganancias = ganancias;
        this.inversionMN = inversionMN;
        this.inversionSede = inversionSede;
        this.multinacional = new ArrayList<>();
        this.sedes= new ArrayList<>();

    }
    @Override
    public String toString(){
        return "Firma: "+firma+", inversion: "+(inversionMN+inversionSede)+", ganancias: "+ganancias;
    }

}
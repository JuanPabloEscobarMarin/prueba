package Clases;


public class Inversionista {

    public String firma;
    public int ganancias;
    public  int inversionSede;
    public  Sede sedes;
    public  Multinacional multinacional;
    public  int inversionMN;

    public Inversionista(String firma, int inversionMN,int inversionSede,int ganancias) {
        this.firma =firma ;
        this.ganancias = ganancias;
        this.inversionMN = inversionMN;
        this.inversionSede = inversionSede;
        this.multinacional = null;
        this.sedes= null;

    }
    @Override
    public String toString(){
        return "Firma: "+firma+", inversion: "+(inversionMN+inversionSede)+", ganancias: "+ganancias;
    }

}
import java.util.ArrayList;

public class Area {

    public String nombreDelArea;
    public ArrayList<Empleado> empleados;
    public  ArrayList<Cliente> clientes;
    public int ingresoArea;
    public Sede sede;
    public  int gastoArea;

    public Area (String nombreDelArea, int ingresoArea,int gastoArea,Sede sede) {
        this.nombreDelArea = nombreDelArea ;
        this.ingresoArea = ingresoArea;
        this.gastoArea= gastoArea;
        this.sede = sede;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Nombre del area: "+nombreDelArea+", numero de empleados: "+empleados.size()+", fondos: "+ingresoArea+", gastos: "+gastoArea+", sede: "+sede.nombre;
    }

}
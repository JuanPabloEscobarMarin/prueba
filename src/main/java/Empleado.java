import java.util.ArrayList;

public class Empleado {
    public String nombre;
    public int cedula;
    public int edad;
    public int salario;
    public Area areaPertenece;
    public ArrayList<Cliente> compradores;

    public Empleado(String nombre, int cedula, int edad, int salario,Area areaPertenece) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad =edad;
        this.salario = salario;
        this.areaPertenece = areaPertenece;
        this.compradores = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Nombre : "+nombre+", cedula: "+cedula+", edad: "+edad+", salario: "+salario+", Area: "+areaPertenece.nombreDelArea;
    }
}
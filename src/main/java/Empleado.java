public class Empleado {
    public String nombre;
    public int cedula;
    public int edad;
    public double salario;
    public Area areaPertenece;
    public Cliente comprador;

    public Empleado(String nombre, int cedula, int edad, double salario,Area areaPertenece) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad =edad;
        this.salario = salario;
        this.areaPertenece = areaPertenece;
        this.comprador = null;
    }

    @Override
    public String toString(){
        return "Nombre : "+nombre+", cedula: "+cedula+", edad: "+edad+", salario: "+salario+", Area: "+areaPertenece.nombreDelArea;
    }
}
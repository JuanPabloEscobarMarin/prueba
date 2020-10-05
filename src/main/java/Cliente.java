public class Cliente {
    public String nombre;
    public int dinero;
    public int cedula;
    public Area AreaConsumo;
    public Empleado vendedor;

    public Cliente(String nombre, int cedula, int dinero,Area AreaConsumo) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cedula = cedula;
        this.AreaConsumo = AreaConsumo;
        this.vendedor = null;
    }

    @Override
    public String toString(){
        return "Nombre : "+nombre+", cedula: "+cedula+", area de consumo: "+AreaConsumo.nombreDelArea+", asesor: "+vendedor.nombre;
    }
}
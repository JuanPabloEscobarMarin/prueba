class Multinacional {
    public String nombre;
    public String ceo;
    public double ingresoTotal;
    public double gastoTotal;
    public Inversionista inversores;
    public Sede sedes;
    public int NIT;


    public Multinacional(String nombre, String ceo, double ingresoTotal, double gastoTotal, int NIT) {
        this.nombre = nombre ;
        this.NIT = NIT;
        this.ceo = ceo;
        this.ingresoTotal = ingresoTotal;
        this.gastoTotal = gastoTotal;
        this.inversores = null;
        this.sedes = null;


    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", ceo: "+ceo+", NIT: "+NIT+", fondos"+ingresoTotal+", gastos"+gastoTotal;
    }


}
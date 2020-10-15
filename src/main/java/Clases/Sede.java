package Clases;

import java.util.ArrayList;

public class Sede {
    public String nombre;
    public String gerente;
    public int ingresoSede;
    public int gastosSede;
    public ArrayList<Area> areas;
    public ArrayList<Inversionista> inversionistas;
    public Multinacional multinacional;
    public Pais paisPertenece;

    public Sede (String nombre, String gerente, int ingresoSede, int gastosSede,Multinacional multinacional,Pais paisPertenece) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.ingresoSede = ingresoSede;
        this.gastosSede = gastosSede;
        this.multinacional=multinacional;
        this.paisPertenece=paisPertenece;
        this.areas = new ArrayList<>();
        this.inversionistas = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Multinacional: "+multinacional.nombre+", Ubicacion: "+paisPertenece.nombre+", nombre: "+nombre+", gerente: "+gerente+", numero de areas: "+areas.size()+", fondos: "+ingresoSede+", gastos: "+gastosSede;
    }
}
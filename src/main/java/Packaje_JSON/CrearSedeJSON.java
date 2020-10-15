/*package Packaje_JSON;

import Clases.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.util.ArrayList;

public class CrearSedeJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarSede(Sede sede){
        JSONObject SedeDatos = new JSONObject();
        SedeDatos.put("nombre", sede.nombre);
        SedeDatos.put("gerente", sede.gerente);
        SedeDatos.put("ingresoSede", sede.ingresoSede);
        SedeDatos.put("gastoSede", sede.gastosSede);
        SedeDatos.put("areas", sede.areas);
        SedeDatos.put("inversionistas", sede.inversionistas);
        JSONObject SedePerfil = new JSONObject();
        SedePerfil.put("Sede", SedePerfil);

        JSONArray SedeLista = new JSONArray();
        SedeLista.add(SedePerfil);
        try (FileWriter file = new FileWriter(ruta+"usuariosJSON.json")) {
            file.write(SedeLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }
}*/
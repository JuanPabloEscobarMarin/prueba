package Packaje_JSON;

import Clases.Sede;
import Clases.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirSedeJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarSede(LinkedList<Sede> sedes) {
        JSONArray SedeLista = new JSONArray();
        for (Sede sede : sedes) {
            JSONObject SedeDatos = new JSONObject();
            SedeDatos.put("nombre", sede.nombre);
            SedeDatos.put("gerente", String.valueOf(sede.gerente));
            SedeDatos.put("ingresoSede", String.valueOf(sede.ingresoSede));
            SedeDatos.put("gastosSede", String.valueOf(sede.gastosSede));
            SedeDatos.put("multinacional", String.valueOf(sede.multinacional));
            SedeDatos.put("paisPertenece", String.valueOf(sede.paisPertenece));
            JSONObject SedePerfil = new JSONObject();
            SedePerfil.put("Usuario", SedeDatos);
            SedeLista.add(SedePerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"SedesJSON.json")) {
            file.write(SedeLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

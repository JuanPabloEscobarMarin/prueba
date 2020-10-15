package Packaje_JSON;

import Clases.Area;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirAreaJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarArea(LinkedList<Area> areas) {
        JSONArray AreaLista = new JSONArray();
        for (Area area : areas) {
            JSONObject AreaDatos = new JSONObject();
            AreaDatos.put("nombreDelArea", area.nombreDelArea);
            AreaDatos.put("ingresoArea", String.valueOf(area.ingresoArea));
            AreaDatos.put("gastoArea", String.valueOf(area.gastoArea));
            JSONObject AreaPerfil = new JSONObject();
            AreaPerfil.put("Multinacional", AreaDatos);
            AreaLista.add(AreaPerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"AreasJSON.json")) {
            file.write(AreaLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

package Packaje_JSON;

import Clases.Multinacional;
import Clases.Pais;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirPaisJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarPais(LinkedList<Pais> pais) {
        JSONArray PaisLista = new JSONArray();
        for (Pais pais1 : pais) {
            JSONObject PaisDatos = new JSONObject();
            PaisDatos.put("nombre", pais1.nombre);
            PaisDatos.put("presidente", pais1.presidente);
            JSONObject PaisPerfil = new JSONObject();
            PaisPerfil.put("Pais", PaisDatos);
            PaisLista.add(PaisPerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"PaisesJSON.json")) {
            file.write(PaisLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

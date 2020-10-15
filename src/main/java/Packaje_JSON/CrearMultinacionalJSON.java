/*package Packaje_JSON;

import Clases.Multinacional;
import Clases.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class CrearMultinacionalJSON {
    public static String ruta = "src/main/resources/database/";

    public static void guardarMultinacional(Multinacional multinacional){
        JSONObject MultinacionalDatos = new JSONObject();
        MultinacionalDatos.put("nombre", multinacional.nombre);
        MultinacionalDatos.put("ceo", multinacional.ceo);
        MultinacionalDatos.put("ingresoTotal", multinacional.ingresoTotal);
        MultinacionalDatos.put("gastos", multinacional.gastoTotal);
        MultinacionalDatos.put("NIT", multinacional.NIT);
        JSONObject MultinacionalPerfil = new JSONObject();
        MultinacionalPerfil.put("Multinacional", MultinacionalDatos);

        JSONArray MultinacionalLista = new JSONArray();
        MultinacionalLista.add(MultinacionalPerfil);
        try (FileWriter file = new FileWriter(ruta+"usuariosJSON.json")) {
            file.write(MultinacionalLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }
}*/

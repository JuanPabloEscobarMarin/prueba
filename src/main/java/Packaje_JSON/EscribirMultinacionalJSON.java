package Packaje_JSON;

import Clases.Inversionista;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.LinkedList;

public class EscribirMultinacionalJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarMultinacional(LinkedList<Multinacional> multinacionals) {
        JSONArray MultinacionalLista = new JSONArray();
        for (Multinacional multinacional : multinacionals) {
            JSONObject MultinacionalDatos = new JSONObject();
            MultinacionalDatos.put("nombre", multinacional.nombre);
            MultinacionalDatos.put("ceo", multinacional.ceo);
            MultinacionalDatos.put("ingresoTotal", String.valueOf(multinacional.ingresoTotal));
            MultinacionalDatos.put("gastoTotal", String.valueOf(multinacional.gastoTotal));
            MultinacionalDatos.put("NIT", String.valueOf(multinacional.NIT));
            JSONObject MultinacionalPerfil = new JSONObject();
            MultinacionalPerfil.put("Multinacional", MultinacionalDatos);
            MultinacionalLista.add(MultinacionalPerfil);
        }
        try (FileWriter file = new FileWriter(ruta+"MultinacionalesJSON.json")) {
            file.write(MultinacionalLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

    public static void guardarMultinacionalconInversionista(LinkedList<Multinacional> multinacionals) {
        JSONArray MultinacionalLista = new JSONArray();
        for (Multinacional multinacional : multinacionals) {
            JSONObject MultinacionalDatos = new JSONObject();
            MultinacionalDatos.put("nombre", multinacional.nombre);
            MultinacionalDatos.put("ceo", multinacional.ceo);
            MultinacionalDatos.put("ingresoTotal", String.valueOf(multinacional.ingresoTotal));
            MultinacionalDatos.put("gastoTotal", String.valueOf(multinacional.gastoTotal));
            MultinacionalDatos.put("NIT", String.valueOf(multinacional.NIT));
            JSONObject MultinacionalPerfil = new JSONObject();
            MultinacionalPerfil.put("Multinacional", MultinacionalDatos);
            MultinacionalLista.add(MultinacionalPerfil);
        }
        try (FileWriter file = new FileWriter(ruta+"MultinacionalesJSON.json")) {
            file.write(MultinacionalLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

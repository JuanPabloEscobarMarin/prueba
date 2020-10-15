package Packaje_JSON;

import Clases.Inversionista;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirInversionistaJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarInversionista(LinkedList<Inversionista> inversionistas) {
        JSONArray InversionistaLista = new JSONArray();
        for (Inversionista inversionista : inversionistas) {
            JSONObject InversionistaDatos = new JSONObject();
            InversionistaDatos.put("firma", inversionista.firma);
            InversionistaDatos.put("ganancias", String.valueOf(inversionista.ganancias));
            InversionistaDatos.put("inversionSede", String.valueOf(inversionista.inversionSede));
            InversionistaDatos.put("inversionMN", String.valueOf(inversionista.inversionMN));
            if (inversionista.multinacional != null){
                InversionistaDatos.put("NIT", String.valueOf(inversionista.multinacional.NIT));
            }
            JSONObject InversionistaPerfil = new JSONObject();
            InversionistaPerfil.put("Inversionista", InversionistaDatos);
            InversionistaLista.add(InversionistaPerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"InversionistasJSON.json")) {
            file.write(InversionistaLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

package Packaje_JSON;


import Clases.*;

import java.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.Principal;
import java.util.LinkedList;

public class LeerSedeJSON {

    //La sede solo se puede poner cuando esté relacionada con multinacional y pais
    /*
    public static LinkedList<Sede> leerSedesJson(){
        LinkedList<Sede> sedesLeidas = new LinkedList<>();
        JSONParser jsonParser = new JSONParser(); //
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"SedesJSON.json"))   {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaSedes = (JSONArray)obj ;
            System.out.println(ListaSedes);

            for(Object sedeObjeto : ListaSedes){
                JSONObject sedeJSON = (JSONObject) sedeObjeto;
                sedesLeidas.add(parseSede(sedeJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return sedesLeidas;
    }

    private static Sede parseSede(JSONObject sedeJSON) {
        JSONObject atributos = (JSONObject) sedeJSON.get("Sede");

        String nombre = (String) atributos.get("nombre");
        String gerente = (String) atributos.get("gerente");
        int ingresoSede = Integer.parseInt((String) atributos.get("ingresoSede"));
        int gastosSede = Integer.parseInt((String) atributos.get("gastosSede"));


        Sede sedeLeida = new Sede(nombre, gerente, ingresoSede, gastosSede);
        return sedeLeida;
    }
*/
}
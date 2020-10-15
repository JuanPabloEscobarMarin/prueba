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
/*
    public static LinkedList<Pais> listaPaises = new LinkedList<>();
    public static LinkedList<Multinacional> listaMultinacionales = new LinkedList<>();
    public static LinkedList<Sede> leerSedesJSON(){
        LinkedList<Sede> sedeCreada = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"SedesJSON.json"))   {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaSedes = (JSONArray)obj ;
            for(Object sedeObjeto : ListaSedes){
                JSONObject sedeJSON = (JSONObject) sedeObjeto;
                sedeCreada.add(parseSede(sedeJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sedeCreada;
    }

    private static Sede parseSede(JSONObject sedeJSON) {
        JSONObject atributos = (JSONObject) sedeJSON.get("Sede");

        String nombre = (String) atributos.get("nombre");
        String gerente = (String) atributos.get("gerente");
        int ingresoSede = Integer.parseInt((String) atributos.get("ingresoSede"));
        int gastosSede = Integer.parseInt((String) atributos.get("gastosSede"));
        String paisPertenece = (String) atributos.get("paisPertenece");
        int NIT = Integer.parseInt((String) atributos.get("NIT"));

        Pais paisaux = null;
        for (Pais paisActual: listaPaises) {
            if (paisActual.nombre.equals(paisPertenece)){
                paisaux = paisActual;
                break;
            }
        }

        Multinacional multinacionalaux = null;
        for (Multinacional multinacionalActual: listaMultinacionales) {
            if (multinacionalActual.NIT == NIT){
                multinacionalaux = multinacionalActual;
                break;
            }
        }

        Sede sedeLeida = new Sede(nombre, gerente, ingresoSede, gastosSede, multinacionalaux, paisaux);
        return sedeLeida;
    }
*/
}
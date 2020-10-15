package Packaje_JSON;

import Clases.Area;
import Clases.Multinacional;
import Clases.Sede;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeerAreaJSON {
/*
    public static LinkedList<Sede> listaDeSedes = new LinkedList<>();
    public static LinkedList<Area> listaDeAreas = new LinkedList<>();
    public static LinkedList<Area> leerAreasJSON(){
        LinkedList<Area> area1 = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"AreasJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaAreas = (JSONArray)obj ;
            for(Object areaObjeto : ListaAreas){
                JSONObject areaJSON = (JSONObject) areaObjeto;
                listaDeAreas.add(parseArea(areaJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return listaDeAreas;
    }

    private static Area parseArea(JSONObject areaJSON) {
        JSONObject atributos = (JSONObject) areaJSON.get("Area");

        String nombre = (String) atributos.get("nombre");
        int ingresoArea = Integer.parseInt((String) atributos.get("ingresoArea"));
        int gastoArea = Integer.parseInt((String) atributos.get("gastoArea"));
        String sede = (String) atributos.get("sede");
        Sede sedeaux = null;
        for (Sede sedeActual : listaDeSedes){
            if (sedeActual.nombre.equals(sede)){
                sedeaux = sedeActual;
                break;
            }
        }

        Area areaLeida = new Area(nombre, ingresoArea, gastoArea, sedeaux);
        return areaLeida;
    }
*/
}

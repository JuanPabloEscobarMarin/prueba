package Packaje_JSON;

import Main.Principal;
import Clases.Inversionista;
import Clases.Multinacional;
import Clases.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class LeerMultinacionalJson {

    public static LinkedList<Multinacional> leerMultinacionalesJSON(){
        LinkedList<Multinacional> multinacionCreada = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"MultinacionalesJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaMultinacionales = (JSONArray)obj ;
            for(Object multinacionalObjeto : ListaMultinacionales){
                JSONObject multinacionalJSON = (JSONObject) multinacionalObjeto;
                multinacionCreada.add(parseMultinacional(multinacionalJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return multinacionCreada;
    }

    private static Multinacional parseMultinacional(JSONObject multinacionalJSON) {
        JSONObject atributos = (JSONObject) multinacionalJSON.get("Multinacional");

        String nombre = (String) atributos.get("nombre");
        String  ceo = (String) atributos.get("ceo");
        int ingresoTotal = Integer.parseInt((String) atributos.get("ingresoTotal"));
        int gastoTotal = Integer.parseInt((String) atributos.get("gastoTotal"));
        int NIT = Integer.parseInt((String) atributos.get("NIT"));


        Multinacional multinacionalLeida = new Multinacional(nombre, ceo, ingresoTotal, gastoTotal, NIT);
        return multinacionalLeida;
    }

}

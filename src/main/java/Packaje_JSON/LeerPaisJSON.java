package Packaje_JSON;

import Clases.Multinacional;
import Clases.Pais;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PipedInputStream;
import java.util.LinkedList;

public class LeerPaisJSON {

    public static LinkedList<Pais> leerPaisesJSON(){
        LinkedList<Pais> paisCreado = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"PaisesJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaPaises = (JSONArray)obj ;
            for(Object paisObjeto : ListaPaises){
                JSONObject paisJSON = (JSONObject) paisObjeto;
                paisCreado.add(parsePais(paisJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return paisCreado;
    }

    private static Pais parsePais(JSONObject paisJSON) {
        JSONObject atributos = (JSONObject) paisJSON.get("Pais");

        String nombre = (String) atributos.get("nombre");
        String presidente = (String) atributos.get("presidente");

        Pais paisLeido = new Pais(nombre, presidente);
        return paisLeido;
    }

}

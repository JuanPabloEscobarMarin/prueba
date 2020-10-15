package Packaje_JSON;

import Clases.Inversionista;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.Principal;
import java.util.LinkedList;

public class LeerInversionistaJSON {

    public static LinkedList<Inversionista> leerInversionistasJSON(){
        LinkedList<Inversionista> inversionistaCreado = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"InversionistasJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaInversionistas = (JSONArray)obj ;
            for(Object inversionistaObjeto : ListaInversionistas){
                JSONObject inversionistaJSON = (JSONObject) inversionistaObjeto;
                inversionistaCreado.add(parseInversionista(inversionistaJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return inversionistaCreado;
    }

    private static Inversionista parseInversionista(JSONObject inversionistaJSON) {
        JSONObject atributos = (JSONObject) inversionistaJSON.get("Inversionista");

        String firma = (String) atributos.get("firma");
        int ganancias = Integer.parseInt((String) atributos.get("ganancias"));
        int inversionSede = Integer.parseInt((String) atributos.get("inversionSede"));
        int inversionMN = Integer.parseInt((String) atributos.get("inversionMN"));

        Inversionista inversionistaLeido = new Inversionista(firma, ganancias, inversionSede, inversionMN);
        return inversionistaLeido;
    }
}

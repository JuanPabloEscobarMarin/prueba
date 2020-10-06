package Packaje_JSON;

import Clases.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Packaje_JSON.EscribirJSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJSON {

    public static ArrayList<Usuario> leerUsuariosJson(){
        ArrayList<Usuario> usuariosLeidos = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"UsuariosJSON.json"))   {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaUsuarios = (JSONArray)obj ;
            System.out.println(ListaUsuarios);

            for(Object usuarioObjeto : ListaUsuarios){
                JSONObject usuarioJSON = (JSONObject) usuarioObjeto;
                usuariosLeidos.add(parseUsuario(usuarioJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return usuariosLeidos;
    }
    private static Usuario parseUsuario(JSONObject usuarioJSON)
    {
        JSONObject atributos = (JSONObject) usuarioJSON.get("Usuario");

        String  documento = (String) atributos.get("documento");
        String nombre = (String) atributos.get("nombre");
        String apellido = (String) atributos.get("apellido");
        String correo = (String) atributos.get("correo");
        String contraseña = (String) atributos.get("contraseña");

        Usuario usuarioLeido = new Usuario(documento,nombre,apellido,contraseña,correo);
        return usuarioLeido;
    }
}
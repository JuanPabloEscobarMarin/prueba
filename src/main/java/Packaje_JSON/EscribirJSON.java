package Packaje_JSON;

import Clases.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EscribirJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarUsuario(LinkedList<Usuario> usuarios) {
        JSONArray UsuarioLista = new JSONArray();
        for (Usuario usuario : usuarios) {
            JSONObject UsuarioDatos = new JSONObject();
            UsuarioDatos.put("documento", String.valueOf(usuario.documento));
            UsuarioDatos.put("nombre", usuario.nombre);
            UsuarioDatos.put("apellido", usuario.apellido);
            UsuarioDatos.put("correo", usuario.correo);
            UsuarioDatos.put("contraseña", usuario.contraseña);
            JSONObject UsuarioPerfil = new JSONObject();
            UsuarioPerfil.put("Usuario", UsuarioDatos);
            UsuarioLista.add(UsuarioPerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"UsuariosJSON.json")) {
            file.write(UsuarioLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }
}




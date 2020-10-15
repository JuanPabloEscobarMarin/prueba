package Packaje_JSON;

import Clases.Area;
import Clases.Cliente;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirClienteJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarCliente(LinkedList<Cliente> clientes) {
        JSONArray ClienteLista = new JSONArray();
        for (Cliente cliente : clientes) {
            JSONObject ClienteDatos = new JSONObject();
            ClienteDatos.put("nombre", cliente.nombre);
            ClienteDatos.put("dinero", String.valueOf(cliente.dinero));
            ClienteDatos.put("cedula", String.valueOf(cliente.cedula));
            JSONObject ClientePerfil = new JSONObject();
            ClientePerfil.put("Cliente", ClienteDatos);
            ClienteLista.add(ClientePerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"ClientesJSON.json")) {
            file.write(ClienteLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

package Packaje_JSON;

import Clases.Cliente;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeerClienteJSON {
/*
    public static LinkedList<Cliente> leerClientesJson(){
        LinkedList<Cliente> clientesleidos = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"ClientesJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaClientes = (JSONArray)obj ;
            System.out.println(ListaClientes);

            for(Object clienteObjeto : ListaClientes){
                JSONObject clienteJSON = (JSONObject) clienteObjeto;
                clientesleidos.add(parseCliente(clienteJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return clientesleidos;
    }

    private static Cliente parseCliente(JSONObject clienteJSON) {
        JSONObject atributos = (JSONObject) clienteJSON.get("Cliente");

        String nombre = (String) atributos.get("nombre");
        int dinero = Integer.parseInt((String) atributos.get("dinero"));
        int cedula = Integer.parseInt((String) atributos.get("cedula"));

        Cliente clienteLeido = new Cliente(nombre, dinero, cedula);
        return clienteLeido;
    }
*/
}

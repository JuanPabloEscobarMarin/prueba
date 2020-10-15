package Packaje_JSON;

import Clases.Empleado;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeerEmpleadoJSON {
/*
    public static LinkedList<Empleado> leerEmpleadosJson(){
        LinkedList<Empleado> empleadosLeidos = new LinkedList<>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(EscribirJSON.ruta+"EmpleadosJSON.json"))  {
            Object obj = jsonParser.parse(reader);
            JSONArray ListaEmpleados = (JSONArray)obj ;
            System.out.println(ListaEmpleados);

            for(Object empleadoObjeto : ListaEmpleados){
                JSONObject empleadoJSON = (JSONObject) empleadoObjeto;
                empleadosLeidos.add(parseEmpleado(empleadoJSON));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return empleadosLeidos;
    }

    private static Empleado parseEmpleado(JSONObject empleadoJSON) {
        JSONObject atributos = (JSONObject) empleadoJSON.get("Empleado");

        String nombre = (String) atributos.get("nombre");
        int cedula = Integer.parseInt((String) atributos.get("cedula"));
        int edad = Integer.parseInt((String) atributos.get("edad"));
        int salario = Integer.parseInt((String) atributos.get("salario"));

        Empleado empleadoLeido = new Empleado(nombre, edad, salario);
        return empleadoLeido;
    }
    */
}

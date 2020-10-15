package Packaje_JSON;

import Clases.Empleado;
import Clases.Multinacional;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.LinkedList;

public class EscribirEmpleadoJSON {

    public static String ruta = "src/main/resources/database/";

    public static void guardarEmpleado(LinkedList<Empleado> empleados) {
        JSONArray EmpleadoLista = new JSONArray();
        for (Empleado empleado : empleados) {
            JSONObject EmpleadoDatos = new JSONObject();
            EmpleadoDatos.put("nombre", empleado.nombre);
            EmpleadoDatos.put("cedula", String.valueOf(empleado.cedula));
            EmpleadoDatos.put("edad", String.valueOf(empleado.edad));
            EmpleadoDatos.put("salario", String.valueOf(empleado.salario));
            JSONObject AreaPerfil = new JSONObject();
            AreaPerfil.put("Empleado", EmpleadoDatos);
            EmpleadoLista.add(AreaPerfil);
        }

        try (FileWriter file = new FileWriter(ruta+"EmpleadosJSON.json")) {
            file.write(EmpleadoLista.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println("Error en: "+e);
        }
    }

}

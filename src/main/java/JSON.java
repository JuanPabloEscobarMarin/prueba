import org.json.simple.JSONObject;

public class JSON {
    public static void main(String[] args) {
        JSONObject myObject = new JSONObject();
        JSONObject myObject2 = new JSONObject();
        JSONObject myObject3 = new JSONObject();
        
        myObject.put("Documento: ", "123");
        myObject.put("Nombre: ", "Dalai");
        myObject.put("Apellido: ", "Lama");
        myObject.put("Correo: ", "Dalai666@gmail.com");
        myObject.put("Contraseña: ", "ElBudaEsPuto");

        myObject2.put("Documento: ", "456");
        myObject2.put("Nombre: ", "Caronte");
        myObject2.put("Apellido: ", "De La Cruz");
        myObject2.put("Correo: ", "necrofilia@gmail.com");
        myObject2.put("Contraseña: ", "Billetes");

        myObject3.put("Documento: ", "789");
        myObject3.put("Nombre: ", "ElProfe");
        myObject3.put("Apellido: ", "Roman");
        myObject3.put("Correo: ", "Santiago@gmail.com");
        myObject3.put("Contraseña: ", "NoQuieroVivir");

        // Valores primitivos
       /* myObject.put("age", new Integer(21));
        myObject.put("bank_account_balance", new Double(20.2));
        myObject.put("is_developer", new Boolean(true));

        // Matrices
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        myObject.put("number_list", myList);

        // Objeto dentro de objeto
        JSONObject subdata = new JSONObject();
        myObject.put("extra_data", subdata);*/

        // Generar cadena de texto JSON
        System.out.print(myObject);
        System.out.print(myObject2);
        System.out.print(myObject3);
    }



}

package Clases;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Usuario {
    public String documento;
    public String nombre;
    public String apellido;
    public String correo;
    public String contraseña;

    public Usuario(String documento, String nombre, String apellido, String correo, String contraseña) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    /*

    public static LinkedList<Usuario> usuarios = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);


    private static void registrarUsuario() {
        System.out.print("Documento : ");
        int Documento = input.nextInt();
        String documentoString = String.valueOf(Documento);
        input.nextLine();
        while (Documento <= 0) {
            System.out.println("Documento invalido ,ingreselo de nuevo ");
            System.out.print("Documento : ");
            Documento = input.nextInt();
        }
        System.out.print("Nombre : ");
        String Nombre = input.nextLine();
        while (Nombre.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo ");
            System.out.print("Nombre : ");
            Nombre = input.nextLine();
        }
        System.out.print("Apellido : ");
        String Apellido = input.nextLine();
        while (Apellido.equals("")) {
            System.out.println("Apellido invalido, ingreselo de nuevo ");
            System.out.print("Apellido: ");
            Apellido = input.nextLine();
        }
        System.out.print("Correo Electronico : ");
        String Correo = input.nextLine();
        while (Correo.equals("")) {
            System.out.println("Correo invalido, ingreselo de nuevo ");
            System.out.print("Correo: ");
            Correo = input.nextLine();
        }
        System.out.print("Contraseña : ");
        String Password = input.nextLine();
        while (Password.equals("")) {
            System.out.println("Contraseña invalido, ingreselo de nuevo ");
            System.out.print("Contraseña: ");
            Password = input.nextLine();
        }

        Usuario nuevoUsuario = new Usuario(documentoString, Nombre, Apellido, Correo, Password);
        usuarios.add(nuevoUsuario);
        Usuario prueba = new Usuario(documentoString, Nombre, Apellido, Correo, Password);
        System.out.println("USUARIO REGISTRADO EXITOSAMENTE");

    }

    public static void main(String[] args) {
        UsuariosParaGuardar();
        System.out.println("Listos los Usuarios para guardar");

        convertirObjetosJavaAJSON();
        System.out.println("Listos el convertidor de objetos java a archivos JSON");
        convertirCadenaAJSONAObjetoJava();
        System.out.println("Aquí se pasa de objeto JSON a String de Java");
        convertirArchivosJSONAObjetoJava();
        System.out.println("Aquí ya se convirtieron los archivos json a objetos JAVA");
    }

    public static String ruta = "src/main/resources/database/";

    public static void aversiiporfinmesaleeslGuardar() {
        String jsonString = new Gson().toString(usuarios);
        try (FileWriter file = new FileWriter(ruta + "usuariosJSON.json")) {
            file.write(jsonString);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


        public static void UsuariosParaGuardar () {
            try {
                Usuario usuario = new Usuario("3117701623", "Mi mama", "De Jesis", "Colalve@unal", "SASUKE");

                String json = new Gson().toJson(usuario);

                System.out.println(json);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static void convertirObjetosJavaAJSON () {
            try {
                Usuario usuario = new Usuario("3117701623", "Mi mama", "De Jesis", "Colalve@unal", "SASUKE");
                Gson gson = new Gson();
                Writer writer = Files.newBufferedWriter(Paths.get(ruta + "usuariosJSON.json"));
                gson.toJson(usuario, writer);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void convertirCadenaAJSONAObjetoJava () {
            try {
                String json = "{\"title\":\"Thinking in Java\",\"isbn\":\"978-0131872486\"" +
                        ",\"year\":1998,\"authors\":[\"Bruce Eckel\"]}";
                ;
                Gson gson = new Gson();
                Usuario usuario = gson.fromJson(json, Usuario.class);
                System.out.println(usuario);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static void convertirArchivosJSONAObjetoJava () {
            try {
                Gson gson = new Gson();
                Reader reader = Files.newBufferedReader(Paths.get(ruta + "usuariosJSON.json"));
                Usuario usuario = gson.fromJson(reader, Usuario.class);
                System.out.println(usuario);
                reader.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }


        }
    }
    */
}
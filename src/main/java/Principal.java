
import Clases.*;

import  java.util.LinkedList;
import java.util.Scanner;

public  class  Principal {

    public static LinkedList<Multinacional>  multinacionales =new LinkedList<>();
    public static LinkedList<Sede>  sedes =new LinkedList<>();
    public static LinkedList<Pais>  paises =new LinkedList<>();
    public static LinkedList<Inversionista>  inversionistas =new LinkedList<>();
    public static LinkedList<Area>  areas =new LinkedList<>();
    public static LinkedList<Empleado>  empleados =new LinkedList<>();
    public static LinkedList<Cliente>  clientes =new LinkedList<>();
    public static LinkedList<Usuario> usuarios = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    public static Usuario usuarioLogueado = new Usuario(null, null, null, null, null);




    public static void main(java.lang.String[] args) {
        String option;


        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Bienvenido ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Registrar usuario");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.println();
            option = input.next();
            switch (option) {
                case "1":
                    ingresarUsuario();


                    break;
                case "2":
                    registrarUsuario();


                    break;
                case "0":
                    break label;
            }
        }


    }

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


        System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
        ingresarUsuario();


    }

    private static void ingresarUsuario() {

        if(usuarios.isEmpty()){
            System.out.println("No se encuentra usuario, debes registrar usuario");
            System.out.println();
            registrarUsuario();
        }

        System.out.println("-----------------------------");
        System.out.println("Ingresar Documento/Correo");
        System.out.println("-----------------------------");
        String DocumentoIngresado = input.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Ingresa la contraseña");
        System.out.println("-----------------------------");
        String PasswordIngresado = input.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.documento.equals(DocumentoIngresado) || usuario.correo.equals(DocumentoIngresado)) {
                for (Usuario usuario2 : usuarios) {
                    if (usuario2.contraseña.equals(PasswordIngresado)) {

                        System.out.println("-----------------------------");
                        System.out.println("LOGUEADO CORRECTAMENTE");
                        System.out.println("logueando...................");
                        usuarioLogueado = usuario;
                        menuPrincipal();
                        return;

                    }

                }


            }


        }
        System.out.println("Datos invalidos, ingreselos denuevo");
        ingresarUsuario();


    }

    private static void menuPrincipal() {
        String option;

        System.out.println("Bienvenido " + usuarioLogueado.nombre + " " + usuarioLogueado.apellido);

        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Administración");
            System.out.println("2. Búsqueda");
            System.out.println("3. Diagnóstico de inconsistencias");
            System.out.println("4. Guardar");
            System.out.println("0. Salir y cancelar");
            System.out.println("-----------------------------");
            option = input.next();
            switch (option) {
                case "1":
                    administracion();
                    break;
                case "2":
                    busqueda();
                    break;
                case "3":
                    diagnostico();
                    break;
                case "4":
                    guardar();
                    break;
                case "0":
                    salirCancelar();
                    break label;

            }
        }
    }


    private static void administracion() {
        String option;
        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Multinacional");
            System.out.println("2. Sedes");
            System.out.println("3. Paises");
            System.out.println("4. Inversionistas");
            System.out.println("5. Areas");
            System.out.println("6. Empleados");
            System.out.println("7. Clientes");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            option = input.next();
            switch (option) {
                case "1":
                    String optionMulti;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver multinacionales");
                    System.out.println("2. Crear multinacional");
                    System.out.println("3. Editar multinacional");
                    System.out.println("4. Eliminar multinacional");
                    System.out.println("-----------------------------");
                    optionMulti=input.next();
                    switch (optionMulti){
                        case "1":
                            VerMultinacional();
                            break;
                        case "2":
                            CrearMultinacional();
                            break;
                        case "3":
                            EditarMultinacional();
                            break;
                        case "4":
                            EliminarMultinacional();
                            break;
                    }
                    break;
                case "2":
                    String optionSede;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver sedes");
                    System.out.println("2. Crear sede");
                    System.out.println("3. Editar sede");
                    System.out.println("4. Eliminar sede");
                    System.out.println("-----------------------------");
                    optionSede=input.next();
                    switch (optionSede){
                        case "1":
                            VerSede();
                            break;
                        case "2":
                            CrearSede();
                            break;
                        case "3":
                            EditarSede();
                            break;
                        case "4":
                            EliminarSede();
                            break;
                    }


                    break;
                case "3":
                    String optionPais;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver paises");
                    System.out.println("2. Crear pais");
                    System.out.println("3. Editar pais");
                    System.out.println("4. Eliminar pais");
                    System.out.println("-----------------------------");
                    optionPais=input.next();
                    switch (optionPais){
                        case "1":
                            VerPais();
                            break;
                        case "2":
                            CrearPais();
                            break;
                        case "3":
                            EditarPais();
                            break;
                        case "4":
                            EliminarPais();
                            break;
                    }


                    break;
                case "4":
                    String optionInversionista;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver invercionistas");
                    System.out.println("2. Crear invercionista");
                    System.out.println("3. Editar invercionista");
                    System.out.println("4. Eliminar invercionista");
                    System.out.println("-----------------------------");
                    optionInversionista=input.next();
                    switch (optionInversionista){
                        case "1":
                            VerInversionista();
                            break;
                        case "2":
                            CrearInversionista();
                            break;
                        case "3":
                            EditarInversionista();
                            break;
                        case "4":
                            //gg
                            EliminarInversionista();
                            break;
                    }


                    break;
                case "5":
                    String optionArea;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver areas");
                    System.out.println("2. Crear area");
                    System.out.println("3. Editar area");
                    System.out.println("4. Eliminar area");
                    System.out.println("-----------------------------");
                    optionArea=input.next();
                    switch (optionArea){
                        case "1":
                            VerArea();
                            break;
                        case "2":
                            CrearArea();
                            break;
                        case "3":
                            EditarArea();
                            break;
                        case "4":
                            EliminarArea();
                            break;
                    }


                    break;
                case "6":
                    String optionEmpleado;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver empleados");
                    System.out.println("2. Crear empleado");
                    System.out.println("3. Editar empleado");
                    System.out.println("4. Eliminar empleado");
                    System.out.println("-----------------------------");
                    optionEmpleado=input.next();
                    switch (optionEmpleado){
                        case "1":
                            VerEmpleado();
                            break;
                        case "2":
                            CrearEmpleado();
                            break;
                        case "3":
                            EditarEmpleado();
                            break;
                        case "4":
                            EliminarEmpleado();
                            break;
                    }


                    break;
                case "7":
                    String optionCliente;
                    System.out.println("-----------------------------");
                    System.out.println("Escoja una opcion:");
                    System.out.println("1. Ver clientes");
                    System.out.println("2. Crear cliente");
                    System.out.println("3. Editar cliente");
                    System.out.println("4. Eliminar cliente");
                    System.out.println("-----------------------------");
                    optionCliente=input.next();
                    switch (optionCliente){
                        case "1":
                            VerCliente();
                            break;
                        case "2":
                            CrearCliente();
                            break;
                        case "3":
                            EditarCliente();
                            break;
                        case "4":
                            EliminarCliente();
                            break;
                    }


                    break;
                case "0":
                    break label;

            }
        }
    }


    private static void busqueda() {
    }

    private static void diagnostico() {
    }

    private static void guardar() {
    }

    private static void salirCancelar() {
        while(true){
            System.out.println("Si sale ahora se perderan los cambios sin guardar");
            System.out.println("Ingrese [N] si desea regresar al  menu principal");
            System.out.println("Ingrese [Y] si desea cerrar el programa");
            String cerrado = input.next();

            if (cerrado.equals("N")||cerrado.equals("n")) {
                System.out.println("Regresando al menu principal");

                return;
            }
            else if (cerrado.equals("Y")||cerrado.equals("y")) {
                System.out.println("CERRANDO PROGRAMA");
                System.exit(0);

            } else {
                System.out.println("Opcion invalida");
                System.out.println("-----------------------------");



            }
        }
    }

    private static void VerMultinacional() {
        if(multinacionales.isEmpty()){
            System.out.println("No se encuentra ninguna multinacional");
            System.out.println("¿Desea crearla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearMultinacional();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de multinacionales");
        for (Multinacional multinacional:multinacionales) {
            System.out.println(multinacional);
        }
    }

    private static void CrearMultinacional() {
        System.out.println("Ingresar datos de la Multinacional");
        System.out.print("Ingrese el nombre de la multinacional: ");
        String nombre=input.next();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        for (Multinacional multinacional:multinacionales) {
            if(multinacional.nombre.equals(nombre)){
                System.out.println("Multinaciona ya existe");
                CrearMultinacional();
            }
        }
        System.out.print("Ingrese el NIT: ");
        int NIT=input.nextInt();
        while(NIT<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("NIT: ");
            NIT=input.nextInt();
        }
        for(Multinacional multinacional:multinacionales){
            if(multinacional.NIT==NIT){
                System.out.println("Multinacional ya existe");
                CrearMultinacional();
            }
        }
        System.out.print("Ingrese el nombre del CEO: ");
        String ceo= input.next();

        while(ceo.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            ceo= input.next();
        }
        System.out.print("Ingrese los fondos de la multinacional: ");
        int ingresos= input.nextInt();
        while(ingresos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Fondos: ");
            ingresos=input.nextInt();
        }
        System.out.print("Ingrese los gastos de la multinacional: ");
        int gastos= input.nextInt();
        while(gastos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Gastos: ");
            gastos=input.nextInt();
        }

        Multinacional nuevaMultinacional=new Multinacional(nombre,ceo,ingresos,gastos,NIT);
        multinacionales.add(nuevaMultinacional);
        System.out.println("Multinacional creada con exito");
    }

    private static void EditarMultinacional() {
        Multinacional multinacionalAux = new Multinacional(null, null, 0, 0, 0);
        label:
        while (true) {
            System.out.println("Selecione como desea buscar la multinacional");
            System.out.println("1. por nombre");
            System.out.println("2. por NIT");
            System.out.println("0. Salir");
            String option = input.next();
            switch (option) {
                case "1":
                    System.out.print("ingrese el nombre de la multinacional: ");
                    String nombre = input.next();
                    for (Multinacional multinacional : multinacionales) {
                        if (multinacional.nombre.equals(nombre)) {
                            System.out.println("Nombre: " + multinacional.nombre);
                            System.out.print("Nuevo nombre: ");
                            input.nextLine();
                            String nombreMulti = input.nextLine();
                            if (!nombreMulti.equals("")) {
                                multinacionalAux.nombre = nombreMulti;
                            } else {
                                multinacionalAux.nombre = multinacional.nombre;
                            }
                            System.out.println("Ceo: " + multinacional.ceo);
                            System.out.print("Nuevo ceo: ");
                            String ceo = input.nextLine();
                            if (!ceo.equals("")) {
                                multinacionalAux.ceo = ceo;
                            } else {
                                multinacionalAux.ceo = multinacional.ceo;
                            }
                            System.out.println("Fondos: " + multinacional.ingresoTotal);
                            System.out.print("Nuevos fondos: ");
                            String fondos = input.nextLine();
                            if (!fondos.equals("")) {
                                multinacionalAux.ingresoTotal = Integer.parseInt(fondos);
                            } else {
                                multinacionalAux.ingresoTotal = multinacional.ingresoTotal;
                            }
                            System.out.println("Gastos: " + multinacional.gastoTotal);
                            System.out.print("Nuevos gastos: ");
                            String gastos = input.nextLine();

                            if (!gastos.equals("")) {
                                multinacionalAux.gastoTotal = Integer.parseInt(gastos);
                            } else {
                                multinacionalAux.gastoTotal = multinacional.gastoTotal;
                            }
                            System.out.println("NIT: " + multinacional.NIT);
                            System.out.print("Nuevo NIT: ");
                            String NIT = input.nextLine();
                            if (!NIT.equals("")) {
                                multinacionalAux.NIT = Integer.parseInt(NIT);
                            } else {
                                multinacionalAux.NIT = multinacional.NIT;
                            }
                            System.out.println("¿Desea guardar los cambios?");
                            System.out.println("Si(Y)/No(N)");
                            String optionGuardado = input.next();
                            switch (optionGuardado) {
                                case "Y":
                                    int indice = multinacionales.indexOf(multinacional);
                                    multinacionales.remove(multinacional);
                                    multinacionales.add(indice, multinacionalAux);

                                    return;
                                case "N":
                                    return;
                            }
                        }
                    }
                    System.out.println("No se encontro multinacional por este nombre");
                    EditarMultinacional();
                    break;

                case "2":
                    System.out.print("ingrese el NIT de la multinacional: ");
                    int NIT = input.nextInt();
                    for (Multinacional multinacional : multinacionales) {
                        if (multinacional.NIT == NIT) {
                            System.out.println("Nombre: " + multinacional.nombre);
                            System.out.print("Nuevo nombre: ");
                            input.nextLine();
                            String nombreMulti = input.nextLine();
                            if (nombreMulti.equals("")) {
                                multinacionalAux.nombre = multinacional.nombre;
                            } else {
                                multinacionalAux.nombre = nombreMulti;
                            }
                            System.out.println("Ceo: " + multinacional.ceo);
                            System.out.print("Nuevo ceo: ");
                            String ceo = input.nextLine();
                            if (!ceo.equals("")) {
                                multinacionalAux.ceo = ceo;
                            } else {
                                multinacionalAux.ceo = multinacional.ceo;
                            }
                            System.out.println("Fondos: " + multinacional.ingresoTotal);
                            System.out.print("Nuevos fondos: ");
                            String fondos = input.nextLine();
                            if (!fondos.equals("")) {
                                multinacionalAux.ingresoTotal = Integer.parseInt(fondos);
                            } else {
                                multinacionalAux.ingresoTotal = multinacional.ingresoTotal;
                            }
                            System.out.println("Gastos: " + multinacional.gastoTotal);
                            System.out.print("Nuevos gastos: ");
                            String gastos = input.nextLine();
                            if (!gastos.equals("")) {
                                multinacionalAux.gastoTotal = Integer.parseInt(gastos);
                            } else {
                                multinacionalAux.gastoTotal = multinacional.gastoTotal;
                            }
                            System.out.println("NIT: " + multinacional.NIT);
                            System.out.print("Nuevo NIT: ");
                            String NITMulti = input.nextLine();
                            if (!NITMulti.equals("")) {
                                multinacionalAux.NIT = Integer.parseInt(NITMulti);
                            } else {
                                multinacionalAux.NIT = multinacional.NIT;
                            }
                            System.out.println("¿Desea guardar los cambios?");
                            System.out.println("Si(Y)/No(N)");
                            String optionGuardado = input.next();
                            switch (optionGuardado) {
                                case "Y":
                                    int indice = multinacionales.indexOf(multinacional);
                                    multinacionales.remove(multinacional);
                                    multinacionales.add(indice, multinacionalAux);

                                    return;
                                case "N":
                                    return;
                            }
                        }
                    }
                    System.out.println("No se encontro multinacional por este nombre");
                    EditarMultinacional();
                    break;
                case "0":
                    break label;
            }
        }
    }
    private static void EliminarMultinacional() {
        label:
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("¿Desea buscar la multinacional a eliminar por nombre o por NIT?");
            System.out.println("1. Nombre ");
            System.out.println("2. NIT ");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");

            String optionMultinacionalBorrador = input.next();

            switch (optionMultinacionalBorrador) {
                case "1":
                    System.out.println("Ingrese el nombre de la multinacional a borrar ");
                    String multinacionalBorrador = input.nextLine();
                    for (Multinacional multinacional : multinacionales) {
                        if (multinacionalBorrador.equalsIgnoreCase(multinacional.nombre)) {
                            System.out.println("¿Esta seguro que desea borrarla?");
                            System.out.println("Si(Y)/No(N)");
                            String optionGuardado = input.next();
                            switch (optionGuardado) {
                                case "Y":
                                    multinacionales.remove(multinacional);
                                    System.out.println("Multinacional borrada con exito");
                                    return;
                                case "N":
                                    return;
                            }
                        }
                    }
                    System.out.println("No se encontro multinacional con este nombre");
                    break;
                case "2":
                    System.out.println("Ingrese el NIT de la multinacional");
                    int multinacionalNIT = input.nextInt();
                    String multinacionalStringNIT = Integer.toString(multinacionalNIT);
                    String multinacionalStringNITDepurada = multinacionalStringNIT.replace(".", "");
                    int multinacionalNITDepurada = Integer.parseInt(multinacionalStringNITDepurada);
                    for (Multinacional multinacional : multinacionales) {
                        if (multinacional.NIT == multinacionalNITDepurada) {
                            System.out.println("¿Esta seguro que desea borrarla?");
                            System.out.println("Si(Y)/No(N)");
                            String optionGuardado = input.next();
                            switch (optionGuardado) {
                                case "Y":
                                    multinacionales.remove(multinacional);
                                    System.out.println("Multinacional borrada con exito");
                                    return;
                                case "N":
                                    return;
                            }
                        }

                    }
                    System.out.println("No se encuentro la multinacional");

                    break;

                case "0":
                    break label;
            }
        }
    }


    private static void VerSede() {
        if(sedes.isEmpty()){
            System.out.println("No se encuentra ninguna sede");
            System.out.println("¿Desea crearla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearSede();
                    break;
                case"2":
                    return;
            }
        }

        System.out.println("Lista de sedes");
        for (Sede sede:sedes) {
            System.out.println(sede);
        }
    }

    private static void CrearSede() {
        System.out.println("Ingrese los datos de la sede");
        System.out.print("Ingrese el nombre de la sede: ");
        String nombre=input.next();
        input.nextLine();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        for(Sede sede:sedes){
            if(sede.nombre.equals(nombre)){
                System.out.println("Sede ya existe");
                CrearMultinacional();
            }
        }
        System.out.print("Ingrese el nombre del gerente: ");
        String gerente= input.next();
        while(gerente.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            gerente= input.next();
        }
        System.out.print("Ingrese los fondos de la sede: ");
        int ingresos= input.nextInt();
        while(ingresos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Fondos: ");
            ingresos=input.nextInt();
        }
        System.out.print("Ingrese los gastos de la sede: ");
        int gastos= input.nextInt();
        while(gastos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Gastos: ");
            gastos=input.nextInt();
        }
        System.out.print("Ingrese el nombre del pais de ubicacion de la sede: ");
        String nombrePais= input.next();
        while(nombrePais.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("nombre: ");
            nombrePais= input.next();
        }
        Pais paisAux=new Pais(null,null);

        for (Pais pais : paises) {
            if (pais.nombre.equals(nombrePais)) {
                paisAux = pais;
            }
        }
        if(paisAux.nombre==null){
            System.out.println("No se encontro un pais con este nombre");
            System.out.println("¿Desea crearlo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String optionPais=input.next();
            switch (optionPais){
                case "1":
                    CrearPais();
                    break;
                case "2":
                    System.out.println("¿Desea continuar creando una Sede? ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    String optionAuxPais=input.next();
                    switch (optionAuxPais){
                        case "1":
                            CrearSede();
                            return;
                        case "2":
                            return;
                    }
                    break;
            }
        }

        System.out.print("Ingrese el NIT de la multinacional a la que pertenece la sede: ");
        int multinacionalNIT= input.nextInt();
        while(multinacionalNIT<=0) {
            System.out.println("NIT invalido, ingreselo de nuevo");
            System.out.print("NIT: ");
            multinacionalNIT= input.nextInt();
        }
        for (Multinacional multinacional:multinacionales) {
            if(multinacional.NIT==multinacionalNIT){
                Sede NuevaSede=new Sede(nombre,gerente,ingresos,gastos,multinacional,paisAux);
                sedes.add(NuevaSede);
                System.out.println("Sede creada con exito");
                multinacional.sedes.add(NuevaSede);
                return;
            }
        }

        System.out.println("No se encontro multinacional a la que pertenece la sede");
        System.out.println("¿Desea crearla?");
        System.out.println("1. si");
        System.out.println("2. no");
        String option= input.next();
        switch (option){
            case "1":
                CrearMultinacional();
                break;
            case "2":
                System.out.println("¿Desea continuar creando una sede?");
                System.out.println("1. si");
                System.out.println("2. no");
                String option2=input.next();
                switch (option2){
                    case "1":
                        CrearSede();
                        break;
                    case "2":
                        return;
                }
                break;
        }

    }

    private static void EditarSede() {
    }

    private static void EliminarSede() {
    }


    private static void VerPais() {
        if(paises.isEmpty()){
            System.out.println("No se encuentra ningun pais");
            System.out.println("¿Desea crearlo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearPais();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de paises");
        for (Pais pais:paises) {
            System.out.println(pais);
        }
    }

    private static void CrearPais() {
        System.out.println("Ingrese los datos del pais");
        System.out.print("Ingrese el nombre del pais: ");
        String nombre=input.next();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        for(Pais pais:paises){
            if(pais.nombre.equals(nombre)){
                System.out.println("Pais ya existe");
                CrearPais();
            }
        }
        System.out.print("Ingrese el nombre del presidente: ");
        String presidente= input.next();
        while(presidente.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            presidente= input.next();
        }

        Pais paisNuevo=new Pais(nombre,presidente);
        paises.add(paisNuevo);
        System.out.println("Pais creado con exito");
    }

    private static void EditarPais() {
    }

    private static void EliminarPais() {
    }



    private static void VerInversionista() {
        if(inversionistas.isEmpty()){
            System.out.println("No se encuentra ningun invervesionista");
            System.out.println("¿Desea crearlo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearInversionista();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de inversionistas");
        for (Inversionista inversionista:inversionistas) {
            System.out.println(inversionista);
        }
    }

    private static void CrearInversionista() {
        System.out.println("Ingrese los datos del inversionista");
        System.out.print("Ingrese el nombre de la firma: ");
        String nombre=input.next();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        for(Inversionista inversionista:inversionistas){
            if(inversionista.firma.equals(nombre)){
                System.out.println("Inversionista ya existe");
                CrearInversionista();
            }
        }
        System.out.print("Ingrese la inversion para la multinacional: ");
        int inversionMn= input.nextInt();
        while(inversionMn<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Inversion: ");
            inversionMn=input.nextInt();
        }
        System.out.print("Ingrese la inversion para sedes: ");
        int inversionSede= input.nextInt();
        while(inversionSede<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Inversion: ");
            inversionSede=input.nextInt();
        }
        System.out.print("Ingrese las gananacias esperadas de la firma: ");
        int ganancia= input.nextInt();
        while(ganancia<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Ganancia: ");
            ganancia=input.nextInt();
        }
        Inversionista nuevoInversionista=new Inversionista(nombre,inversionMn,inversionSede,ganancia);
        inversionistas.add(nuevoInversionista);

    }

    private static void EditarInversionista() {
    }

    private static void EliminarInversionista() {
    }


    private static void VerArea() {
        if(areas.isEmpty()){
            System.out.println("No se encuentra ninguna area");
            System.out.println("¿Desea crearla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearArea();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de areas");
        for (Area area:areas) {
            System.out.println(area);
        }
    }

    private static void CrearArea() {
        System.out.println("Ingrese los datos de la area");
        System.out.print("Ingrese el nombre de la area: ");
        String nombre=input.next();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        for(Area area:areas){
            if(area.nombreDelArea.equals(nombre)){
                System.out.println("Area ya existe");
                CrearArea();
            }
        }
        System.out.print("Ingrese los fondos de la area: ");
        int ingresos= input.nextInt();
        while(ingresos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Fondos: ");
            ingresos=input.nextInt();
        }
        System.out.print("Ingrese los gastos de la area: ");
        int gastos= input.nextInt();
        while(gastos<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Gastos: ");
            gastos=input.nextInt();
        }
        System.out.print("Ingrese el nombre de la sede a la que pertenece el area: ");
        String nombreSede=input.next();
        input.nextLine();
        while(nombreSede.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombreSede= input.next();
        }
        for (Sede sede:sedes) {
            if(sede.nombre.equals(nombreSede)){
                Area NuevaArea=new Area(nombre,ingresos,gastos,sede);
                areas.add(NuevaArea);
                sede.areas.add(NuevaArea);
                System.out.println("Area creada con exito");
                return;
            }
        }
        System.out.println("No se encontro sede a la que pertenece la area");
        System.out.println("¿Desea crearla?");
        System.out.println("1. si");
        System.out.println("2. no");
        String option= input.next();
        switch (option){
            case "1":
                CrearSede();
                break;
            case "2":
                System.out.println("¿Desea continuar creando una area?");
                System.out.println("1. si");
                System.out.println("2. no");
                String option2=input.next();
                switch (option2){
                    case "1":
                        CrearArea();
                        break;
                    case "2":
                        return;
                }
                break;
        }
    }

    private static void EditarArea() {
    }

    private static void EliminarArea() {
    }


    private static void VerEmpleado() {
        if(empleados.isEmpty()){
            System.out.println("No se encuentra ningun empleado");
            System.out.println("¿Desea crearla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearEmpleado();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de empleados");
        for (Empleado empleado:empleados) {
            System.out.println(empleado);
        }
    }

    private static void CrearEmpleado() {
        System.out.println("Ingrese los datos del empleado");
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre=input.next();
        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        System.out.print("Ingrese la cedula: ");
        int cedula=input.nextInt();
        while(cedula<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Cedula: ");
            cedula=input.nextInt();
        }
        for(Empleado empleado:empleados){
            if(empleado.cedula==cedula){
                System.out.println("Empleado ya existe");
                CrearEmpleado();
            }
        }
        System.out.print("Ingrese la edad: ");
        int edad=input.nextInt();
        while(edad<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Edad: ");
            edad=input.nextInt();
        }
        System.out.print("Ingrese el salario: ");
        int salario=input.nextInt();
        while(salario<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Salario: ");
            salario=input.nextInt();
        }
        System.out.print("Ingrese el nombre del area a la que pertenece el empleado: ");
        String nombreArea=input.next();
        while(nombreArea.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombreArea= input.next();
        }
        for (Area area:areas) {
            if(area.nombreDelArea.equals(nombreArea)){
                Empleado NuevoEmpleado=new Empleado(nombre,cedula,edad,salario,area);
                empleados.add(NuevoEmpleado);
                area.empleados.add(NuevoEmpleado);
                System.out.println("Empleado creado con exito");
                return;
            }
        }
        System.out.println("No se encontro area a la que pertenece el empelado");
        System.out.println("¿Desea crearla?");
        System.out.println("1. si");
        System.out.println("2. no");
        String option= input.next();
        switch (option){
            case "1":
                CrearArea();
                break;
            case "2":
                System.out.println("¿Desea continuar creando un empleado?");
                System.out.println("1. si");
                System.out.println("2. no");
                String option2=input.next();
                switch (option2){
                    case "1":
                        CrearEmpleado();
                        break;
                    case "2":
                        return;
                }
                break;
        }

    }

    private static void EditarEmpleado() {
    }

    private static void EliminarEmpleado() {
    }



    private static void VerCliente() {
        if(clientes.isEmpty()){
            System.out.println("No se encuentra ningun cliente");
            System.out.println("¿Desea crearla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String option= input.next();
            switch (option){
                case "1":
                    CrearCliente();
                    break;
                case"2":
                    return;
            }
        }
        System.out.println("Lista de multinacionales");
        for (Cliente cliente:clientes) {
            System.out.println(cliente);
        }
    }

    private static void CrearCliente() {
        System.out.println("Ingrese los datos del cliente");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre=input.next();

        while(nombre.equals("")) {
            System.out.println("nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombre= input.next();
        }
        System.out.print("Ingrese la cedula: ");
        int cedula=input.nextInt();
        while(cedula<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Cedula: ");
            cedula=input.nextInt();
        }
        for(Cliente cliente:clientes){
            if(cliente.cedula==cedula){
                System.out.println("Cliente ya existe");
                CrearCliente();
            }
        }
        System.out.print("Ingrese el efectivo: ");
        int efectivo=input.nextInt();
        while(efectivo<=0){
            System.out.println("valor invalido, ingreselo de nuevo");
            System.out.print("Efectivo: ");
            efectivo=input.nextInt();
        }
        System.out.print("Ingrese el nombre del area de consumo: ");
        String nombreArea=input.next();
        while(nombreArea.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo");
            System.out.print("Nombre: ");
            nombreArea= input.next();
        }
        for (Area area:areas) {
            if(area.nombreDelArea.equals(nombreArea)){
                Cliente NuevoCliente=new Cliente(nombre,cedula,efectivo,area);
                clientes.add(NuevoCliente);
                area.clientes.add(NuevoCliente);
                System.out.println("Cliente creado con exito");
                return;
            }
        }
        System.out.println("No se encontro area de consumo del cliente");
        System.out.println("¿Desea crearla?");
        System.out.println("1. si");
        System.out.println("2. no");
        String option= input.next();
        switch (option){
            case "1":
                CrearArea();
                break;
            case "2":
                System.out.println("¿Desea continuar creando un cliente?");
                System.out.println("1. si");
                System.out.println("2. no");
                String option2=input.next();
                switch (option2){
                    case "1":
                        CrearCliente();
                        break;
                    case "2":
                        return;
                }
                break;
        }

    }

    private static void EditarCliente() {
    }

    private static void EliminarCliente() {
    }

}
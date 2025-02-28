package Solicitud.logicaCliente;

import Solicitud.helpers.HelperImpresion2;
import Solicitud.helpers.HelperValidacion2;
import Solicitud.logicaNegocio.Actividad;
import Solicitud.logicaNegocio.Solicitud;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String solicitante, cc, codigo;
        String nombreActividad, id, descripcion;
        int opc = 0, num_soli = 0;
        Scanner sc = new Scanner(System.in);
        int rta, conteo;

        ArrayList<Actividad> listaActividadesGlobal = null;
        Actividad activi;
        Solicitud objsolicitud;
        ArrayList<Solicitud> listaSolicitud = new ArrayList<>();

        do {
            System.out.println("1. Registrar solicitante");
            System.out.println("2. Mostrar solicitante");
            System.out.println("3. Salir");

            do {
                try {
                    System.out.println("Digite una opcion valida");
                    opc = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                sc.nextLine();

            } while (opc <= 0);

            switch (opc) {
                case 1 -> {
                    ArrayList<Actividad> listaActividadlocal = new ArrayList<>();
                    do {
                        try {

                            System.out.println("Digite el numero de solicitantes que va a ingresar");
                            num_soli = sc.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        sc.nextLine();
                    } while (num_soli <= 0);

                    for (int i = 0; i < num_soli; i++) {
                        System.out.println("Ingrese el nombre de la actividad");
                        nombreActividad = sc.nextLine();

                        rta = HelperValidacion2.ValidarVacio(nombreActividad);

                        while (rta > 0) {
                            System.out.println("Ingrese el nombre de la actividad");
                            nombreActividad = sc.nextLine();
                            rta = HelperValidacion2.ValidarVacio(nombreActividad);
                        }
                        conteo = HelperValidacion2.ValidarTodo(nombreActividad);

                        while (conteo != 0) {
                            System.out.println("Ingrese el nombre de la actividad");
                            nombreActividad = sc.nextLine();
                            conteo = HelperValidacion2.ValidarTodo(nombreActividad);
                        }
                        //termina nombre

                        System.out.println("Digite el id de la actividad");
                        id = sc.nextLine();

                        rta = HelperValidacion2.ValidarVacio(id);

                        while (rta > 0) {
                            System.out.println("Digite el id  de la actividad");
                            id = sc.nextLine();
                            rta = HelperValidacion2.ValidarVacio(id);
                        }

                        conteo = HelperValidacion2.ValidarTodoSerial(id);

                        while (conteo != 0) {
                            System.out.println("Digite el id de la actividad");
                            id = sc.nextLine();
                            conteo = HelperValidacion2.ValidarTodoSerial(id);
                        }
                        //termina id

                        System.out.println("Escriba la descripcion del actividad");
                        descripcion = sc.nextLine();

                        rta = HelperValidacion2.ValidarVacio(descripcion);

                        while (rta > 0) {
                            System.out.println("Escriba la descripcion del actividad");
                            descripcion = sc.nextLine();
                            rta = HelperValidacion2.ValidarVacio(descripcion);
                        }

                        conteo = HelperValidacion2.ValidarTodo(descripcion);

                        while (conteo != 0) {
                            System.out.println("Escriba la descripcion del actividad");
                            descripcion = sc.nextLine();
                            conteo = HelperValidacion2.ValidarTodo(descripcion);
                        }
                        //termina descripción

                        activi = new Actividad(nombreActividad, id, descripcion);
                        listaActividadlocal.add(activi);
                    }
                    listaActividadesGlobal = listaActividadlocal;
                    listaActividadlocal = null;

                    System.out.println("Digite el nombre de la persona");
                    solicitante = sc.nextLine();

                    rta = HelperValidacion2.ValidarVacio(solicitante);

                    while (rta > 0) {
                        System.out.println("Digite el nombre  del solicitante");
                        solicitante = sc.nextLine();
                        rta = HelperValidacion2.ValidarVacio(solicitante);
                    }

                    conteo = HelperValidacion2.ValidarTodo(solicitante);

                    while (conteo != 0) {
                        System.out.println("Digite el nombre del solicitante");
                        solicitante = sc.nextLine();
                        conteo = HelperValidacion2.ValidarTodo(solicitante);
                    }
                    //termina solicitante

                    System.out.println("Digite la cc de la persona");
                    cc = sc.nextLine();

                    rta = HelperValidacion2.ValidarVacio(cc);

                    while (rta > 0) {
                        System.out.println("Digite la cc de la persona");
                        cc = sc.nextLine();
                        rta = HelperValidacion2.ValidarVacio(cc);
                    }

                    conteo = HelperValidacion2.ValidarTodoLetra(cc);

                    while (conteo != 0) {
                        System.out.println("Digite la cc de la persona");
                        cc = sc.nextLine();
                        conteo = HelperValidacion2.ValidarTodoLetra(cc);

                    }
                    //termina cc

                    System.out.println("Digite el codigo de la persona");
                    codigo = sc.nextLine();
                    rta = HelperValidacion2.ValidarVacio(codigo);

                    while (rta > 0) {
                        System.out.println("Digite el codigo de la persona");
                        codigo = sc.nextLine();
                        rta = HelperValidacion2.ValidarVacio(codigo);
                    }

                    conteo = HelperValidacion2.ValidarTodoLetra(codigo);

                    while (conteo != 0) {
                        System.out.println("Digite el codigo de la persona");
                        codigo = sc.nextLine();
                        conteo = HelperValidacion2.ValidarTodoLetra(codigo);
                    }
                    //termina cedula

                    objsolicitud = new Solicitud(solicitante, cc, codigo, listaActividadesGlobal);
                    listaSolicitud.add(objsolicitud);
                }
                case 2 -> {
                    HelperImpresion2.ImprimirInfo(listaSolicitud);
                }
                case 3 -> {

                }
            }
        } while (opc != 3);
    }
}

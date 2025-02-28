/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solicitud.helpers;

import Solicitud.logicaNegocio.Solicitud;
import java.util.ArrayList;

/**
 *
 * @author luisk
 */
public class HelperImpresion2 {
    public static void ImprimirInfo(ArrayList<Solicitud> aux) {
       

        for (int i = 0; i < aux.size(); i++) {
            System.out.println("Persona"+(i+1)+"\n");
            System.out.println("El nombre del solicitante es:" + "\t" + aux.get(i).getSolicitante());
            System.out.println("La cedula del solicitante es:" + "\t" + aux.get(i).getCc());
            System.out.println("El codigo del solicitante es:" + "\t" + aux.get(i).getCodigo());
            System.out.println("\n");

            for (int j = 0; j < aux.get(i).getActividades().size(); j++) {
                System.out.println("Actividad"+(j+1));
                System.out.println("El nombre de la actividad es:" + "\t" + aux.get(i).getActividades().get(j).getNombreActividad());
                System.out.println("El id de la actividad es:" + "\t" + aux.get(i).getActividades().get(j).getId());
                System.out.println("La descripcion de la actividad es:" + "\t" + aux.get(i).getActividades().get(j).getDescripcion());
                System.out.println("\n");
            }
        }
    }
}

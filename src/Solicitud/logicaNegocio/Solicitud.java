/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solicitud.logicaNegocio;
import java.util.ArrayList;

/**
 *
 * @author luisk
 */
public class Solicitud {

    String solicitante, cc, codigo;
    public ArrayList<Actividad> actividades;

    public Solicitud() {

    }

    public Solicitud(String solicitante, String cc, String codigo, ArrayList<Actividad> actividades) {
        this.solicitante = solicitante;
        this.cc = cc;
        this.codigo = codigo;
        this.actividades = actividades;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
    
}
package Solicitud.logicaNegocio;

/**
 *
 * @author luisk
 */
public class Actividad {

    String nombreActividad, id, descripcion;

    public Actividad() {
    }

    public Actividad(String nombreActividad, String id, String descripcion) {
        this.nombreActividad = nombreActividad;
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

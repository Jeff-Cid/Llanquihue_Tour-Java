package LlanquihueTour.model;

/** Clase Cliente que hereda de la clase Persona.
 * reutiliza todo lo de persona.
 * */

public class Cliente extends Persona {

    /** Atributos propios de la clase Cliente */
    private String nacionalidad;
    private String idiomas;

    public Cliente(String nombre, String apellido, Rut rut, int telefono, String correo, Direccion direccion, String nacionalidad, String idiomas) {
        super(nombre, apellido, rut, telefono, correo, direccion);
        this.nacionalidad = nacionalidad;
        this.idiomas = idiomas;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNacionalidad: " + nacionalidad
                + "\nIdiomas: " + idiomas;
    }
}

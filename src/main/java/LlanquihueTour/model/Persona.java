package LlanquihueTour.model;

/** CLASE BASE
 *  Posee atributos propios como nombre, apellido, telefono y correo
 *  también posee atributos de otras clases 'rut y direccion' (composición)
 */

public class Persona {

    private String nombre;
    private String apellido;
    private Rut rut; // composición
    private int telefono;
    private String correo;
    private Direccion direccion; // composición

    public Persona(String nombre, String apellido, Rut rut, int telefono, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido
                + "\n" + rut
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo
                + "\n" + direccion;
    }
}

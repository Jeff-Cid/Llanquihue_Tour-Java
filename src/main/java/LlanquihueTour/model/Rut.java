package LlanquihueTour.model;

public class Rut {

    private String numero;

    public Rut(String numeroRut) {
        setNumero(numeroRut);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numeroRut) {
        if (!numeroRut.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("Formato de RUT invalido");
        }
        this.numero = numeroRut;
    }

    @Override
    public String toString() {
        return "RUT: " + numero;
    }
}

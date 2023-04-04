package ObserverPattern;

import java.util.ArrayList;

public class Director implements Observado{

    private String nombre;
    private String apellido;
    private boolean manoDerecha;
    private boolean manoIzquierda;
    private ArrayList<Observador> observadores;


    public Director() {
        this.observadores = new ArrayList<>();
    }
    @Override
    public void agregarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.escuchar(this);
        }
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

    public boolean isManoDerecha() {
        return manoDerecha;
    }

    public void setManoDerecha(boolean manoDerecha) {
        this.manoDerecha = manoDerecha;
    }

    public boolean isManoIzquierda() {
        return manoIzquierda;
    }

    public void setManoIzquierda(boolean manoIzquierda) {
        this.manoIzquierda = manoIzquierda;
    }

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }
}

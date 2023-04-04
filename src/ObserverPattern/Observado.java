package ObserverPattern;

public interface Observado{

    public void agregarObservador(Observador observador);

    public void notificar();
}

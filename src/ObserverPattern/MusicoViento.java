package ObserverPattern;

public class MusicoViento implements Observador {

    @Override
    public void escuchar(Observado observado) {
        if (observado instanceof Director && ((Director) observado).isManoDerecha()) {
            System.out.println("El músico de viento toca ");
        }
    }
}

package ObserverPattern;

public class MusicoPercusion implements Observador {

    @Override
    public void escuchar(Observado observado) {
        if (observado instanceof Director && ((Director) observado).isManoDerecha()) {
            System.out.println("El músico de percusion toca ");
        }
    }
}

package StatePattern;

public class Apagado implements Color {

    @Override
    public void cambiar(Semaforo semaforo) {

        System.out.println("El semaforo esta apagado");
    }
}

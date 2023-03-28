package StatePattern;

public class LuzRoja implements Color {

    public LuzRoja() {
        System.out.println("El semaforo esta en rojo");
    }
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new LuzVerde());
    }
}

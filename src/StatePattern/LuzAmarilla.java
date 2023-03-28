package StatePattern;

public class LuzAmarilla implements Color {

    public LuzAmarilla() {
        System.out.println("El semaforo esta en amarillo");
    }
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new LuzRoja());
    }
}

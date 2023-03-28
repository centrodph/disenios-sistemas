package StatePattern;

public class LuzVerde  implements Color{

    public LuzVerde() {
        System.out.println("El semaforo esta en verde");
    }
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.setColor(new LuzAmarilla());
    }
}

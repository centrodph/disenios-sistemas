package StatePattern;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("State pattern");
            Semaforo semaforo = new Semaforo();
            semaforo.encender();
            semaforo.cambiar();
            // Sleep for 5 seconds
            Thread.sleep(5000);

            semaforo.cambiar();

            Thread.sleep(5000);
            semaforo.cambiar();


            Thread.sleep(5000);
            semaforo.cambiar();


            Thread.sleep(5000);
            semaforo.cambiar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

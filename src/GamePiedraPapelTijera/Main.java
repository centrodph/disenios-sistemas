package GamePiedraPapelTijera;

public class Main {

    public static void main(String[] args) {
        Element papel = new Papel();
        Element piedra = new Piedra();
        Element tijera = new Tijera();

        System.out.println("Papel vs Piedra: " + papel.contra(piedra));
        System.out.println("Papel vs Tijera: " + papel.contra(tijera));
        System.out.println("Papel vs Papel: " + papel.contra(papel));
        System.out.println("Piedra vs Piedra: " + piedra.contra(piedra));
        System.out.println("Piedra vs Tijera: " + piedra.contra(tijera));
        System.out.println("Piedra vs Papel: " + piedra.contra(papel));
        System.out.println("Tijera vs Piedra: " + tijera.contra(piedra));
        System.out.println("Tijera vs Tijera: " + tijera.contra(tijera));
        System.out.println("Tijera vs Papel: " + tijera.contra(papel));

    }
}

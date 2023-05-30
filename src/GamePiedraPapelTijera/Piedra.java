package GamePiedraPapelTijera;

public class Piedra extends Element {

    public String contra(Element e) {
        return e.contra(this);
    }
    public String contra(Papel e) {
        return "Gana Papel";
    }

    public String contra(Piedra e) {
        return "Empate";
    }

    public String contra(Tijera e) {
        return "Gana Piedra";
    }
}

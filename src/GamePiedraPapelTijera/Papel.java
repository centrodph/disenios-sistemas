package GamePiedraPapelTijera;

public class Papel extends Element {

    public String contra(Element e) {
        return e.contra(this);
    }

    public String contra(Papel e) {
        return "Empate";
    }

    public String contra(Piedra e) {
        return "Gana piedra";
    }

    public String contra(Tijera e) {
        return "Gana tijera";
    }
}

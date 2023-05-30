package GamePiedraPapelTijera;

public class Tijera  extends Element{

    public String contra(Element e) {
        return e.contra(this);
    }
    public String contra(Papel e){
        return "Gana tijera";
    }
    public String contra(Piedra e){
        return "Gana Piedra";
    }
    public String contra(Tijera e){
        return "Empate";
    }
}

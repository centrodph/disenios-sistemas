package GamePiedraPapelTijera;

public abstract class Element {
    public abstract String contra(Element e);
    public abstract String contra(Papel e);
    public abstract String contra(Piedra e);
    public abstract String contra(Tijera e);

}

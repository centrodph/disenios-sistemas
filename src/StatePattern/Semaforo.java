package StatePattern;

public class Semaforo {
    private Color color;

    public Semaforo() {
        this.color = new Apagado();
    }
    public void setColor(Color luzColor) {
        this.color = luzColor;
    }

    public void cambiar() {
        this.color.cambiar(this);
    }

    public void encender() {
        this.setColor(new LuzRoja());
    }
}

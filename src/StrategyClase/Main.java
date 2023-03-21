package StrategyClase;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        Documento doc = new Documento();
        doc.setNombre("Exmaple doc");
        doc.setTipoDocumento(new PDF());
        doc.exportar();
        doc.setTipoDocumento(new TXT());
        doc.exportar();
    }
}
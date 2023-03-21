package StrategyClase;

public class PDF implements TipoDocumento{
    @Override
    public void exportar(Documento documento) {
        System.out.println("exportando a PDF");
    }
}

package StrategyClase;

public class TXT implements TipoDocumento{
    @Override
    public void exportar(Documento documento) {
        System.out.println("exportando a TXT");
    }
}

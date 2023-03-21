package StrategyClase;

public class WORD implements TipoDocumento{
    @Override
    public void exportar(Documento documento) {
        System.out.println("exportando a WORD");
    }
}

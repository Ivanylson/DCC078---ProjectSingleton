import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void deveRetornarNomeDaEmpresa()
    {
        Empresa.getInstance().setNomeEmpresa("Unidos não venceremos");
        assertEquals("Unidos não venceremos", Empresa.getInstance().getNomeEmpresa());
    }
    @Test
    void deveRetornarNomeDoDiretor()
    {
        Empresa.getInstance().setNomeDiretor("Birobiro");
        assertEquals("Birobiro", Empresa.getInstance().getNomeDiretor());
    }

}
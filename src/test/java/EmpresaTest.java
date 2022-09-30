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
    @Test
    void deveRetornarCNPJ()
    {
        Empresa.getInstance().setNomeDiretor("11.111.111/0001-11");
        assertEquals("11.111.111/0001-11", Empresa.getInstance().getNomeDiretor());
    }
}
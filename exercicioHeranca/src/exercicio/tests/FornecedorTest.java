package exercicio.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio.entities.Fornecedor;

public class FornecedorTest {
	
    @Test

    public void testObterSaldo() {
        Fornecedor fornecedor = new Fornecedor("Fabrica A", "Rua do Brasil", "987654321", 1000, 500);
        double saldoEsperado = fornecedor.getValorCredito() - fornecedor.getValorDivida();
        assertEquals(saldoEsperado, fornecedor.obterSaldo());
    }
}
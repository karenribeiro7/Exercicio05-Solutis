package exercicio.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio.entities.Vendedor;

class VendedorTest {

	@Test
	public void testCalcularSalario() {
		Vendedor vendedor = new Vendedor("Lucas", "Rua B", "444555666", 2, 2500.00, 0.07, 15000.00, 0.08);
		double salarioEsperado = (vendedor.getSalarioBase() + 
				(vendedor.getValorVendas() * vendedor.getComissao()))-
				((vendedor.getSalarioBase() + (vendedor.getValorVendas() * vendedor.getComissao())) * vendedor.getImposto());
		assertEquals(salarioEsperado, vendedor.calcularSalario(), 0.01);
	}

}

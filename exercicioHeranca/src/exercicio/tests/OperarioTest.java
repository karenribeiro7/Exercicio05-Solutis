package exercicio.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio.entities.Operario;

class OperarioTest {

	@Test
	public void testCalcularSalario() {
		Operario operador = new Operario("Ana", "Rua W", "9988776655", 4, 2200.00, 0.12, 12000.00, 0.04);
		double salarioEsperado = (operador.getSalarioBase() + (operador.getValorProducao() * operador.getComissao()))-((operador.getSalarioBase() + (operador.getValorProducao() * operador.getComissao())) * operador.getImposto());
		assertEquals(salarioEsperado, operador.calcularSalario(), 0.01);
	}

}

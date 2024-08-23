package exercicio.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio.entities.Empregado;

class EmpregadoTest {

	@Test
	
	public void testCalcularSalario() {
		Empregado empregado = new Empregado("Maria", "Rua 10", "981234567", 5, 5000.0, 0.15);
		
		double salarioEsperado = empregado.getSalarioBase() - (empregado.getSalarioBase() * empregado.getImposto());
		
        assertEquals(salarioEsperado, empregado.calcularSalario(), 0.01);
    }
}

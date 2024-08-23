package exercicio.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio.entities.Administrador;

class AdministradorTest {

	@Test
	public void testCalcularSalario() {
		Administrador administrador = new Administrador("Maria", "Rua 10", "981234567", 5, 5000.0, 0.15, 500);
		
		double salarioEsperado = (administrador.getSalarioBase() + administrador.getAjudaDeCusto()) - ((administrador.getSalarioBase() + administrador.getAjudaDeCusto()) * administrador.getImposto());
		
        assertEquals(salarioEsperado, administrador.calcularSalario(), 0.01);
	}

}

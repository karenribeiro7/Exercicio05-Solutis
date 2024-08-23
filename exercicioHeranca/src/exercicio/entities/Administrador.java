package exercicio.entities;

public class Administrador extends Empregado {
	
	double ajudaDeCusto;

	public Administrador(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
			
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		double salarioBase = super.getSalarioBase() + ajudaDeCusto; 
	    return salarioBase - (salarioBase * getImposto()); 
	}
	
	
}

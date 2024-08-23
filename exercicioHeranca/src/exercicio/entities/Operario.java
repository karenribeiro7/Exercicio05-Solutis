package exercicio.entities;

public class Operario extends Empregado {
	double valorProducao;
	double comissao;
	
	public Operario(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	 @Override
	    public double calcularSalario() {
	        double salarioBase = super.getSalarioBase();
	        double valorComissao = (valorProducao * comissao);
	        return (salarioBase + valorComissao) - (salarioBase + valorComissao) * super.getImposto();
	    }
	
	
}

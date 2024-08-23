package exercicio.entities;

public class Vendedor extends Empregado {
	double valorVendas;
	double comissao;
	
	public Vendedor(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
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
	        double vendas = (valorVendas * comissao);
	        return (salarioBase + vendas) - (salarioBase + vendas) * super.getImposto();
	    }
}

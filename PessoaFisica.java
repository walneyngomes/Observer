package br.cesed.si.map.observer.exemplo1;

public class PessoaFisica implements Pessoa{
	public double valor;
	

	@Override
	public void salarioNovo(double salario) {
		// TODO Auto-generated method stub
		this.valor=salario;

		
	}

	@Override
	public void salarioAtual() {
		// TODO Auto-generated method stub
		System.out.print("VALOR ATUAL"+this.valor);
		
	}

}

package br.cesed.si.map.observer.exemplo1;

public class PessoaJuridica implements Pessoa{
     double valor=(double)23.2;
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

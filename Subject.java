package br.cesed.si.map.observer.exemplo1;

import java.util.ArrayList;

public class Subject {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    public void cadastrar(Pessoa cadastroPessoas){
    	pessoas.add(cadastroPessoas);
    }
    public void salarioUptade(double salario){
    	for (Pessoa d : pessoas) {
			d.salarioNovo(salario);
		}
    }
    public void salarioAtual(){
    	for (Pessoa d : pessoas) {
			d.salarioAtual();
		}
    }
}

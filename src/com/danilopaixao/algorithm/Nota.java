package com.danilopaixao.algorithm;

public class Nota {
	
	private String aluno;
	private double valor;
	
	public Nota(String aluno, double valor) {
		this.setAluno(aluno);
		this.setValor(valor);
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}

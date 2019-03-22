package com.danilopaixao.vo;

public class Note {
	
	private String aluno;
	private double valor;
	
	public Note(String aluno, double valor) {
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

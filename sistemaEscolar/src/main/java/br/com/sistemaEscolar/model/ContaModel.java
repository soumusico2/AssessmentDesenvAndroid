package br.com.sistemaEscolar.model;

public class ContaModel {
	
	private long id;
	private String descricao;
	private boolean finalizado;
	//private calendar dataFinalizacao;

	public String getDescricao() {
		return descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

package com.fhdev.sdtesting.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fhdev.sdtesting.enums.CertaOuErrada;

@Entity
public class Opcao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer certaOuErrada;
	
	@ManyToOne
	@JoinColumn(name = "questao_id")
	private Questao questao;
	
	public Opcao() {
			
	}

	public Opcao(Integer id, String descricao, CertaOuErrada certaOuErrada, Questao questao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.certaOuErrada = certaOuErrada.getCodigo();
		this.questao = questao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CertaOuErrada getCertaOuErrada() {
		return CertaOuErrada.toEnum(certaOuErrada);
	}

	public void setCertaOuErrada(CertaOuErrada certaOuErrada) {
		this.certaOuErrada = certaOuErrada.getCodigo();
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Opcao other = (Opcao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

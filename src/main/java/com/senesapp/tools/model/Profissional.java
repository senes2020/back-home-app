package com.senesapp.tools.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name="tbl_profissionais")
public class Profissional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String carteira_motorista;
	
	@NotNull
	private String valor_hora;
	
	@ManyToMany
	@JoinColumn(name = "especializacao", referencedColumnName = "id_especializacao")
	private List<Especializacao> especializacoes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCarteira_motorista() {
		return carteira_motorista;
	}

	public void setCarteira_motorista(String carteira_motorista) {
		this.carteira_motorista = carteira_motorista;
	}

	public String getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(String valor_hora) {
		this.valor_hora = valor_hora;
	}

	public List<Especializacao> getEspecializacoes() {
	return especializacoes;
	}

	public void setEspecializacoes(List<Especializacao> especializacoes) {
		this.especializacoes = especializacoes;
	}
	
}










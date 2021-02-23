package com.profissionais.apirest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PROFISSIONAL")
public class Profissionais implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome;	
	private String endereco;
	private int crm;
	private String especialidade;	
	private String telefone;
	private int diaAtendimento;
	private int horaAtendimento;

	
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getDiaAtendimento() {
		return diaAtendimento;
	}
	public void setDiaAtendimento(int diaAtendimento) {
		this.diaAtendimento = diaAtendimento;
	}
	public int getHoraAtendimento() {
		return horaAtendimento;
	}
	public void setHoraAtendimento(int horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}
	

}

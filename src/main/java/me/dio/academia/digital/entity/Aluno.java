package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" })
public class Aluno {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  public LocalDate getDataDeNascimento() {
	return dataDeNascimento;
}


public void setDataDeNascimento(LocalDate dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getBairro() {
	return bairro;
}


public void setBairro(String bairro) {
	this.bairro = bairro;
}


private LocalDate dataDeNascimento;
  
  
  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // quando tiver requisicao, vai carregar todas as informacões MENOS a lista de avaliacao fisica
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();


public void setNome(Object nome2) {
	
}


public void setCpf() {
	
}


public void setCpf(Object cpf2) {
	
}


public List<AvaliacaoFisica> getAvaliacoes() {
	return null;
}

}

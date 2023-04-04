package it.prova.proprietariojpa.model;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "proprietario")
public class Proprietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "cf")
	private String cf;
	@Column(name = "datadinascita")
	private LocalDate dataDiNascista;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proprietario")
	private Set<Automobile> automobili = new HashSet<>();
	
	
	

	public Proprietario(Long id, String nome, String cognome, String cf, LocalDate dataDiNascista,
			Set<Automobile> automobili) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.dataDiNascista = dataDiNascista;
		this.automobili = automobili;
	}

	public Proprietario(Long id, String nome, String cognome, String cf, LocalDate dataDiNascista) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.dataDiNascista = dataDiNascista;
		}

	public Proprietario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public LocalDate getDataDiNascista() {
		return dataDiNascista;
	}

	public void setDataDiNascista(LocalDate dataDiNascista) {
		this.dataDiNascista = dataDiNascista;
	}

	public Set<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(Set<Automobile> automobili) {
		this.automobili = automobili;
	}

	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", dataDiNascista="
				+ dataDiNascista + ", automobili=" + automobili + "]";
	}
	

}

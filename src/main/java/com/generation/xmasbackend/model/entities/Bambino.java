package com.generation.xmasbackend.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Bambino extends BaseEntity
{
	private String nomeCognome;
	private int puntiBonta;
	private String citta;

	@OneToMany(mappedBy = "bambino")
	private List<Consegna> consegne = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name="paese_id")
	private Paese paese;

	public String getNomeCognome()
	{
		return nomeCognome;
	}

	public void setNomeCognome(String nome)
	{
		this.nomeCognome = nome;
	}

	public int getPuntiBonta()
	{
		return puntiBonta;
	}

	public void setPuntiBonta(int puntiBonta)
	{
		this.puntiBonta = puntiBonta;
	}

	public List<Consegna> getConsegne()
	{
		return consegne;
	}

	public void setConsegne(List<Consegna> consegne)
	{
		this.consegne = consegne;
	}

	public String getCitta()
	{
		return citta;
	}

	public void setCitta(String citta)
	{
		this.citta = citta;
	}
}

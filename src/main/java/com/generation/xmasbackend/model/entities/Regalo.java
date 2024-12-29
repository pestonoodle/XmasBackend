package com.generation.xmasbackend.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Regalo extends BaseEntity
{
	private int punteggio;
	private double prezzo;

	@OneToMany(mappedBy = "regalo")
	private List<Consegna> consegne = new ArrayList<>();


	public int getPunteggio()
	{
		return punteggio;
	}

	public void setPunteggio(int punteggio)
	{
		this.punteggio = punteggio;
	}

	public double getPrezzo()
	{
		return prezzo;
	}

	public void setPrezzo(double prezzo)
	{
		this.prezzo = prezzo;
	}

	public List<Consegna> getConsegne()
	{
		return consegne;
	}

	public void setConsegne(List<Consegna> consegne)
	{
		this.consegne = consegne;
	}
}

package com.generation.xmasbackend.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Consegna extends BaseEntity
{
	@ManyToOne
	@JoinColumn(name= "bambino_id")
	private Bambino bambino;

	@ManyToOne
	@JoinColumn(name = "regalo_id")
	private Regalo regalo;

	private String paese;

	private Valuta valuta;

	private final double velocitaSlitta= 3500 ; //kmh

	private static Set<Consegna> totConsegne = new HashSet<>();

	public Bambino getBambino()
	{
		return bambino;
	}

	public void setBambino(Bambino bambino)
	{
		this.bambino = bambino;
	}

	public Regalo getRegalo()
	{
		return regalo;
	}

	public void setRegalo(Regalo regalo)
	{
		this.regalo = regalo;
	}

	public String getPaese()
	{
		return paese;
	}

	public void setPaese(String paese)
	{
		this.paese = paese;

		boolean alreadyExists = false;

		for (Consegna c : totConsegne) {
			if (c.getPaese().equals(this.paese)) {
				alreadyExists = true;
				break;
			}
			else totConsegne.add(c);
		}

	}

	public Set<Consegna> getTotConsegne()
	{
		return totConsegne;
	}


	public Valuta getValuta()
	{
		return valuta;
	}

	public void setValuta(Valuta valuta)
	{
		this.valuta = valuta;
	}

	public double getVelocitaSlitta()
	{
		return velocitaSlitta;
	}
}

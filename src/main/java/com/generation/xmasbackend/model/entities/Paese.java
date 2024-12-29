package com.generation.xmasbackend.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Paese extends BaseEntity implements Comparable<Paese>
{
	@OneToMany(mappedBy = "paese")
	List<Bambino> bambini = new ArrayList<Bambino>();

	@OneToOne(mappedBy = "fattura")
	private Fattura fattura;

	private Valuta valuta;

	private double distanzaSeattle;

	private final static int velocita = 3500;

	public double calcoloVolo()
	{

		return distanzaSeattle / velocita;
	}

	@Override
	public int compareTo(Paese o)
	{
//		if(distanzaSeattle> o.distanzaSeattle){
//			return 1;
//		}
//		if(distanzaSeattle < o.distanzaSeattle){
//			return -1;
//		}
//		return 0;

//		return (int) (distanzaSeattle - o.distanzaSeattle);

		return Double.compare(distanzaSeattle, o.distanzaSeattle);
	}
}

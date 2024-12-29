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


	private Regalo scegliRegalo(){
		double min= bambino.getPuntiBonta()-(bambino.getPuntiBonta()*0.2);
		double max= bambino.getPuntiBonta()+(bambino.getPuntiBonta()*0.2);

		// regalo regalo.getPunteggio()>min && regalo.getPunteggio()<max
	}

}

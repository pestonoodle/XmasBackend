package com.generation.xmasbackend.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Fattura extends BaseEntity
{
	@OneToOne
	@JoinColumn(name = "paese_id")
	private Paese paese;

}

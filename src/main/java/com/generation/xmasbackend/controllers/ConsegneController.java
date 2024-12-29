package com.generation.xmasbackend.controllers;

import com.generation.xmasbackend.model.entities.Bambino;
import com.generation.xmasbackend.model.entities.Regalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/consegne")
public class ConsegneController
{
	@Autowired
	public double calcoloDistanze()
	{

		return 0;
	}

	//Collections.sort(ListaDaSortare)

	public void inizializzaConsegne()
	{
		List<Bambino> bambini = new ArrayList<Bambino>();
		List<Regalo> regali = new ArrayList<Regalo>();


	}


}

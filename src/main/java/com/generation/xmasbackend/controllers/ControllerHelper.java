package com.generation.xmasbackend.controllers;

import com.generation.xmasbackend.model.entities.*;

import java.util.List;

public interface ControllerHelper
{
	List<Regalo> findAllRegalo();
	List<Bambino> findAllBambino();
	List<Paese> findAllPaese();
	List<Fattura> findAllFattura();
	List<Consegna> findAllConsegna();

}

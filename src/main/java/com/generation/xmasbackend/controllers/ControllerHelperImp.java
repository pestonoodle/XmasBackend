package com.generation.xmasbackend.controllers;

import com.generation.xmasbackend.model.entities.*;
import com.generation.xmasbackend.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerHelperImp implements ControllerHelper
{
	@Autowired
	private BambinoRepository bRepo;

	@Autowired
	private PaeseRepository pRepo;

	@Autowired
	private RegaloRepository rRepo;

	@Autowired
	private ConsegnaRepository cRepo;

	@Autowired
	private FatturaRepository fRepo;


	@Override
	public List<Regalo> findAllRegalo()
	{
		return rRepo.findAll();
	}

	@Override
	public List<Bambino> findAllBambino()
	{
		return bRepo.findAll();
	}

	@Override
	public List<Paese> findAllPaese()
	{
		return pRepo.findAll();
	}

	@Override
	public List<Fattura> findAllFattura()
	{
		return fRepo.findAll();
	}

	@Override
	public List<Consegna> findAllConsegna()
	{
		return cRepo.findAll();
	}
}

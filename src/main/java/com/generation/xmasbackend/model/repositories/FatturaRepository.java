package com.generation.xmasbackend.model.repositories;

import com.generation.xmasbackend.model.entities.Fattura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FatturaRepository extends JpaRepository<Fattura, Long>
{
}

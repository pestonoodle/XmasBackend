package com.generation.xmasbackend.model.repositories;

import com.generation.xmasbackend.model.entities.Bambino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BambinoRepository extends JpaRepository<Bambino, Long>
{
}

package com.generation.xmasbackend.model.repositories;

import com.generation.xmasbackend.model.entities.Regalo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegaloRepository extends JpaRepository<Regalo, Long>
{
}

package org.example.capitals.repository;

import org.example.capitals.Entity.Capitals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapitalRepoInterface extends JpaRepository<Capitals,Integer> {
}

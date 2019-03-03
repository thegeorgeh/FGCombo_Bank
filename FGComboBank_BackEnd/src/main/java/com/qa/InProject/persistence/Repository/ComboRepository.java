package com.qa.InProject.persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.InProject.persistence.Domain.Combo;

@Repository
public interface ComboRepository extends JpaRepository<Combo, Long>{

}

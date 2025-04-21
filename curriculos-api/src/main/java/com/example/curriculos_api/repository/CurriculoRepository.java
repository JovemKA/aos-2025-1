package com.example.curriculos_api.repository;

import com.example.curriculos_api.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {

}

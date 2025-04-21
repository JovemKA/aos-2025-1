package com.example.curriculos_api.service;

import com.example.curriculos_api.model.Curriculo;
import com.example.curriculos_api.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<Curriculo> findAll() {
        return curriculoRepository.findAll();
    }

    public Curriculo save(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public Curriculo findById(Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        curriculoRepository.deleteById(id);
    }

}

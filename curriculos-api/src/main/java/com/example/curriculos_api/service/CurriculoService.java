package com.example.curriculos_api.service;

import com.example.curriculos_api.model.Curriculo;
import com.example.curriculos_api.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    
    public Curriculo update(Long id, Curriculo curriculo) {
        Optional<Curriculo> curriculoExistenteOpt = curriculoRepository.findById(id);

        if (curriculoExistenteOpt.isPresent()) {
            Curriculo curriculoExistente = curriculoExistenteOpt.get();

            if (curriculo.getNome() != null) {
                curriculoExistente.setNome(curriculo.getNome());
            }
            if (curriculo.getEmail() != null) {
                curriculoExistente.setEmail(curriculo.getEmail());
            }
            if (curriculo.getTelefone() != null) {
                curriculoExistente.setTelefone(curriculo.getTelefone());
            }
            if (curriculo.getExperiencia() != null) {
                curriculoExistente.setExperiencia(curriculo.getExperiencia());
            }
            if (curriculo.getEducacao() != null) {
                curriculoExistente.setEducacao(curriculo.getEducacao());
            }

            try {
                return curriculoRepository.save(curriculoExistente);
            } catch (Exception e) {
                // Registro de erro para depuração, se necessário
                return null;
            }
        }
        return null;
    }
}

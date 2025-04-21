package com.example.curriculos_api.controller;

import com.example.curriculos_api.model.Curriculo;
import com.example.curriculos_api.service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Curriculo> createCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo novoCurriculo = curriculoService.save(curriculo);
        return ResponseEntity.ok(novoCurriculo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> getCurriculoById(@PathVariable Long id) {
        Curriculo curriculo = curriculoService.findById(id);
        return curriculo != null ? ResponseEntity.ok(curriculo) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculo(@PathVariable Long id) {
        curriculoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curriculo> updateCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        Curriculo curriculoAtualizado = curriculoService.update(id, curriculo);
        return curriculoAtualizado != null ? 
           ResponseEntity.ok(curriculoAtualizado) : 
           ResponseEntity.notFound().build();
    }
}

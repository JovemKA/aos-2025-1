package com.example.pessoa_api;

import com.example.pessoa_api.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private final Pessoa pessoa;

    public PessoaController(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @GetMapping
    public Pessoa getPessoa() {
        return pessoa;
    }
}

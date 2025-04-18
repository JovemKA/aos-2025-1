package com.example.pessoa_api;

import com.example.pessoa_api.Pessoa;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Bean
    public Pessoa pessoa(
            @Value("${pessoa.nome}") String nome,
            @Value("${pessoa.idade}") int idade,
            @Value("${pessoa.sexo}") String sexo,
            @Value("${pessoa.estadoCivil}") String estadoCivil,
            @Value("${pessoa.profissao}") String profissao
    ) {
        return new Pessoa(nome, idade, sexo, estadoCivil, profissao);
    }
}

package com.example.pessoa_api;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final String sexo;
    private final String estadoCivil;
    private final String profissao;

    public Pessoa(String nome, int idade,  String sexo, String estadoCivil, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    // Getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getSexo() { return sexo; }
    public String getEstadoCivil() { return estadoCivil; }
    public String getProfissao() { return profissao; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}

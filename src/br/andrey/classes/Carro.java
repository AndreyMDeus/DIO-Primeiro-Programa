package br.andrey.classes;

import java.util.Objects;

public class Carro {

    private String nome;
    private String nomeMontadora;
    private Integer ano;

    public Carro() {
    }

    public Carro(String nome, String nomeMontadora, Integer ano) {
        this.nome = nome;
        this.nomeMontadora = nomeMontadora;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMontadora() {
        return nomeMontadora;
    }

    public void setNomeMontadora(String nomeMontadora) {
        this.nomeMontadora = nomeMontadora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(nome, carro.nome) && Objects.equals(nomeMontadora, carro.nomeMontadora) && Objects.equals(ano, carro.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nomeMontadora, ano);
    }

    @Override
    public String toString() {
        return "classes.Carro{" +
                "nome='" + nome + '\'' +
                ", nomeMontadora='" + nomeMontadora + '\'' +
                ", ano=" + ano +
                '}';
    }
}

package br.com.geodatapaises;

import java.io.Serializable;
import java.util.ArrayList;
import java.text.Collator;

/**
 * Criado por Vinicius Lima RA:201313379
 */

public class Pais implements Serializable, Comparable {
    private String nome;
    private String codigo3;
    private String capital;
    private String regiao;
    private String bandeira;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }


    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }



    @Override
    public String toString() {
        return "Pais{" +
                "\nnome='" + nome + '\'' +
                "\ncodigo3='" + codigo3 + '\'' +
                "\ncapital='" + capital + '\'' +
                "\nregiao='" + regiao + '\'' +
                "\nbandeira='" + bandeira + '\'' ;

    }

    @Override
    public int compareTo(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return 0;
        } else {
            Pais pais = (Pais) o;
            Collator c = Collator.getInstance();
            c.setStrength(Collator.PRIMARY);
            return c.compare(this.nome, pais.getNome());

        }
    }
}
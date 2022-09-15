package br.unigran.listatelefonica;

import java.util.Date;

public class Contato {

    public static byte[] getNascimento;
    private String nome;
    private String telefone;
    private Date nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Object getId() {
        return null;
    }

    public void setId(int parseInt) {
    }
}

package br.unigran.listatelefonica;

public class Contato {

    public static byte[] getNascimento;
    private String nome;
    private String telefone;
    private String nascimento;

    public static Object getText() {
        return null;
    }

    public String getNome() {
        return nome;
    }
    public  void setNome(String nome){this.nome = nome;}


    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Object getId() {
        return null;
    }

    public void setId(int parseInt) {
    }

    public void setContato(String toString) {

    }

    @Override
    public String toString()
    {
        return "Nome: "+nome+" |Telefone: "+telefone+" | Nascimento: "+nascimento;
    }
}

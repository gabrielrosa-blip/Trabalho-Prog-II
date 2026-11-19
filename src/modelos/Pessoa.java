package modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private List<String> telefones;
    private String email;

    public Pessoa(String nome, String cpf, Endereco endereco, List<String> telefones, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefones = telefones != null  ? telefones : new ArrayList<>() ;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public List<String> getTelefones() {
        return telefones;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

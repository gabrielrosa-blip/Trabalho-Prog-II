package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private String telefoneCelular;
    private LocalDate dataContratacao;
    private String cargo;
    private Double salario;
    private String user;
    private String password;
    private List<Transacao> transacoes;

    public Funcionario(String nome, String cpf, Endereco endereco, List<String> telefones,
                       String email, String telefoneCelular, LocalDate dataContratacao,
                       String cargo, Double salario, String user, String password) {
        super(nome, cpf, endereco, telefones, email);
        this.telefoneCelular = telefoneCelular;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.user = user;
        this.password = password;
        this.transacoes = new ArrayList<>();
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public String getCargo() {
        return cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }

}

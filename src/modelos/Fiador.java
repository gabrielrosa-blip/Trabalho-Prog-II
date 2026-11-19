package modelos;

public class Fiador {
    private String nome;
    private String cpf;
    private String telefone;
    private Double rendaMensal;

    public Fiador(String nome, String cpf, String telefone, Double rendaMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rendaMensal = rendaMensal;
    }

    @Override
    public String toString(){
        return nome + "- CPF: " + cpf + "- TELEFONE: " + telefone +
                "- RENDA MENSAL: " + rendaMensal;
    }
}

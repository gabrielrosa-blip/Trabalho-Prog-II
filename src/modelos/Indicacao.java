package modelos;

public class Indicacao {
    private String nome;
    private String telefone;
    private String relacao;

    public Indicacao(String nome, String telefone, String relacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.relacao = relacao;
    }

    @Override
    public String toString(){
        return nome + ", " + telefone + ", " + relacao;
    }
}

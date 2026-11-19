package modelos;

import java.util.ArrayList;
import java.util.List;

public class ClienteUsuario extends Cliente {
    private List<Fiador> fiadores;
    private List<Indicacao>  indicacoes;

    public ClienteUsuario(String nome, String cpf, Endereco endereco, List<String> telefones,
                          String email, String sexo, String estadoCivil, String profissao) {
        super(nome, cpf, endereco, telefones, email, sexo, estadoCivil, profissao);
        this.fiadores = new ArrayList<>();
        this.indicacoes = new ArrayList<>();
    }
    public void adicionarFiador(Fiador fiador) {
        this.fiadores.add(fiador);
    }
    public void adicionarIndicacao(Indicacao indicacao) {
        this.indicacoes.add(indicacao);
    }
    public Boolean validarRequisitosLocacao(){
        return !fiadores.isEmpty() && !(indicacoes.size() < 2);
    }

}

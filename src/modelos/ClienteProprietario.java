package modelos;

import java.util.ArrayList;
import java.util.List;

public class ClienteProprietario extends Cliente {
    private List<Imovel> imoveis;

    public ClienteProprietario(String nome, String cpf, Endereco endereco,
                               List<String> telefones, String email, String sexo,
                               String estadoCivil, String profissao) {
        super(nome, cpf, endereco, telefones, email, sexo, estadoCivil, profissao);
        this.imoveis = new ArrayList<>();
    }
    public void adicionarImovel(Imovel imovel) {
        if(!imoveis.contains(imovel)){
            imoveis.add(imovel);
        }
    }
    public void removerImovel(Imovel imovel) {
        if(imoveis.contains(imovel)){
            imoveis.remove(imovel);
        }
    }
}

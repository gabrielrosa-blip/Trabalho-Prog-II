package modelos;

import java.util.List;

public abstract class Cliente extends Pessoa {
    private final String sexo;
    private final String estadoCivil;
    private final String profissao;

    public Cliente(String nome, String cpf, Endereco endereco, List<String> telefones,
                   String email, String sexo, String estadoCivil, String profissao) {
        super(nome, cpf, endereco, telefones, email);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    public String getSexo() {
        return sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getProfissao() {
        return profissao;
    }
}

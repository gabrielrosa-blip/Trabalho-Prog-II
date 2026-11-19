package servico;

import enums.CategoriaImovel;
import enums.StatusImovel;
import modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServicoImobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();
    private List<ClienteProprietario> proprietarios = new ArrayList<>();
    private List<ClienteUsuario> usuarios = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Transacao> transacoes = new ArrayList<>();

    public void cadastrarImovel(Imovel imovel) throws IllegalArgumentException {
        if (imovel == null) {
            throw new IllegalArgumentException("Imovel nao pode ser nulo!");
        }
        imoveis.add(imovel);
    }

    public void cadastrarProprietario(ClienteProprietario proprietario) throws IllegalArgumentException {
        if (proprietario == null) {
            throw new IllegalArgumentException("Proprietario nao pode ser nulo!");
        }
        if (proprietario.getCpf() == null || proprietario.getCpf().trim().isEmpty()) {
            throw new IllegalArgumentException("CPF nao pode estar em branco!");
        }
        if (buscarUsuarioPorCpf(proprietario.getCpf()).isPresent()){
            throw new IllegalArgumentException("CPF ja utilizado!");
        }

        proprietarios.add(proprietario);
    }

    public void cadastrarUsuario(ClienteUsuario usuario) throws IllegalArgumentException {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario nao pode ser nulo!");
        }
        if (usuario.getCpf() == null || usuario.getCpf().trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do usuario nao pode ser vazio!");
        }
        if (buscarUsuarioPorCpf(usuario.getCpf()).isPresent()) {
            throw new IllegalArgumentException("Ja existe um usuario com esse CPF!");
        }
        usuarios.add(usuario);
    }

    public void cadastrarFuncionario(Funcionario funcionario) throws IllegalArgumentException {
        if (funcionario == null) {
            throw new IllegalArgumentException("Funcionario nao pode ser nulo!");
        }
        funcionarios.add(funcionario);
    }

    public void registrarTransacao(Transacao transacao) throws IllegalArgumentException {
        if (transacao == null) {
            throw new IllegalArgumentException("Transacao nao pode ser nula!");
        }
        transacoes.add(transacao);
    }

    public Optional<ClienteProprietario> buscarProprietarioPorCpf(String cpf) throws IllegalArgumentException {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do proprietario nao pode ser vazio!");
        }
        return proprietarios.stream()
                .filter(p -> p.getCpf().equalsIgnoreCase(cpf.trim()))
                .findFirst();
    }

    public Optional<ClienteUsuario> buscarUsuarioPorCpf(String cpf) throws IllegalArgumentException {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do Usuario nao pode ser vazio!");
        }
        return usuarios.stream()
                .filter(u -> u.getCpf().equalsIgnoreCase(cpf.trim()))
                .findFirst();
    }

    public List<Imovel> filtrarPorStatus(StatusImovel status) throws IllegalArgumentException {
        if (status == null) {
            throw new IllegalArgumentException("Status nao pode ser nulo!");
        }
        return imoveis.stream()
                .filter(i -> i.getStatusImovel() == status)
                .collect(Collectors.toList());
    }

    public List<Imovel> filtrarPorBairro(String bairro) throws IllegalArgumentException {
        if (bairro == null || bairro.trim().isEmpty()) {
            throw new IllegalArgumentException("Bairro nao pode ser vazio!");
        }
        return imoveis.stream()
                .filter(i -> i.getEndereco().getBairro().equalsIgnoreCase(bairro.trim()))
                .collect(Collectors.toList());
    }

    public List<Imovel> filtrarPorCategoria(CategoriaImovel categoria) throws IllegalArgumentException {
        if (categoria == null) {
            throw new IllegalArgumentException("Categoria nao pode ser nula!");
        }
        return imoveis.stream()
                .filter(i -> i.getCategoriaImovel() == categoria)
                .collect(Collectors.toList());
    }

    public List<Imovel> listarTodosImoveis() {
        return imoveis;
    }

    public List<ClienteProprietario> listarProprietarios() {
        return proprietarios;
    }
    public List<ClienteUsuario> listarUsuarios() {
        return usuarios;
    }

    public List<Transacao> listarTransacoes() {
        return transacoes;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}



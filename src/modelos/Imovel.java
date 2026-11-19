package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class  Imovel {
    private static int sequenciaCodigo = 1;
    private int codigo;
    private CategoriaImovel categoriaImovel;
    private StatusImovel statusImovel;
    private LocalDate dataConstrucao;
    private LocalDate dataDisponibilizacao;
    private LocalDate dataFechamento;
    private Endereco endereco;
    private double valorSugirido;
    private List<ClienteProprietario> proprietarios;

    public Imovel(CategoriaImovel categoriaImovel, StatusImovel statusImovel, LocalDate dataConstrucao,
                  LocalDate dataDisponizacao, Endereco endereco, double valorSugerido,
                  ClienteProprietario proprietarioInicial){
        if (proprietarioInicial == null){
            throw new IllegalArgumentException("Todo imóvel deve ter no menos um cliente proprietário.");
        }
        this.codigo = sequenciaCodigo++;
        this.categoriaImovel = categoriaImovel;
        this.statusImovel = statusImovel;
        this.dataConstrucao = dataConstrucao;
        this.dataDisponibilizacao = dataDisponizacao;
        this.endereco = endereco;
        this.valorSugirido = valorSugerido;
        this.proprietarios = new ArrayList<>();
        adicionarProprietario(proprietarioInicial);
    }

    public void adicionarProprietario(ClienteProprietario proprietario){
        if(!this.proprietarios.contains(proprietario)){
            this.proprietarios.add(proprietario);
            proprietario.adicionarImovel(this);
        }
    }


    public abstract String exibirDetalhes();

    public int getCodigo() {
        return codigo;
    }

    public CategoriaImovel getCategoriaImovel() {
        return categoriaImovel;
    }

    public StatusImovel getStatusImovel() {
        return statusImovel;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public LocalDate getDataDisponibilizacao() {
        return dataDisponibilizacao;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValorSugirido() {
        return valorSugirido;
    }

    public List<ClienteProprietario> getProprietarios() {
        return proprietarios;
    }
}
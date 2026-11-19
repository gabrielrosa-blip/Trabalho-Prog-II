package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;
import java.time.LocalDate;

public abstract class ImovelResidencial extends Imovel{
    protected int qtdQuartos;
    protected int qtdSuites;
    protected int qtdSalasEstar;
    protected int qtdSalasJantar;
    protected int vagasGaragem;
    protected double areaM2;
    protected boolean possuiArmario;
    protected String descricao;

    public ImovelResidencial(CategoriaImovel categoriaImovel, StatusImovel statusImovel,
                             LocalDate dataConstrucao, LocalDate dataDisponizacao,
                             Endereco endereco, double valorSugerido,
                             ClienteProprietario proprietarioInicial, int qtdQuartos,
                             int qtdSuites, int qtdSalasEstar, int qtdSalasJantar,
                             int vagasGaragem, double areaM2, boolean possuiArmario, String descricao) {
        super(categoriaImovel, statusImovel, dataConstrucao, dataDisponizacao, endereco, valorSugerido, proprietarioInicial);
        this.qtdQuartos = qtdQuartos;
        this.qtdSuites = qtdSuites;
        this.qtdSalasEstar = qtdSalasEstar;
        this.qtdSalasJantar = qtdSalasJantar;
        this.vagasGaragem = vagasGaragem;
        this.areaM2 = areaM2;
        this.possuiArmario = possuiArmario;
        this.descricao = descricao;
    }

    @Override
    public String exibirDetalhes() {
        return "";
    }

}

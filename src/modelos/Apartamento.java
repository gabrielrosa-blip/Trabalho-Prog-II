package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;

import java.time.LocalDate;

public class Apartamento  extends ImovelResidencial{
    private final int andar;
    private final Double valorCondominio;
    private final Boolean possuiPortaria24h;

    public Apartamento(CategoriaImovel categoriaImovel,
                       StatusImovel statusImovel, LocalDate dataConstrucao,
                       LocalDate dataDisponizacao, Endereco endereco,
                       double valorSugerido, ClienteProprietario proprietarioInicial,
                       int qtdQuartos, int qtdSuites, int qtdSalasEstar,
                       int qtdSalasJantar, int vagasGaragem, double areaM2,
                       boolean possuiArmario, String descricao, int andar,
                       Double valorCondominio, Boolean possuiPortaria24h) {
        super(categoriaImovel, statusImovel, dataConstrucao, dataDisponizacao, endereco, valorSugerido, proprietarioInicial, qtdQuartos, qtdSuites, qtdSalasEstar, qtdSalasJantar, vagasGaragem, areaM2, possuiArmario, descricao);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.possuiPortaria24h = possuiPortaria24h;
    }
    @Override
    public String exibirDetalhes() {
        return String.format("Apartamento #%d %s | %dº Andar | " +
                "Área: %1fm² | %d Quartos | Condomínio: R$ %.2f | Portaria 24h: %s | Valor R$ %.2f | Status: %s",
                getCodigo(), andar, areaM2, qtdQuartos, valorCondominio, possuiPortaria24h ? "Sim":"Não", getValorSugirido(),getStatusImovel());
    }
}

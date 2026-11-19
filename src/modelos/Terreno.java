package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;

import java.time.LocalDate;

public class Terreno extends Imovel {
    private final Double areaM2;
    private final Double largura;
    private final Double comprimento;
    private final Boolean possuiAcliveDeclive;

    public Terreno(CategoriaImovel categoriaImovel, StatusImovel statusImovel,
                   LocalDate dataConstrucao, LocalDate dataDisponizacao,
                   Endereco endereco, double valorSugerido,
                   ClienteProprietario proprietarioInicial, Double areaM2,
                   Double largura, Double comprimento,
                   Boolean possuiAcliveDeclive) {
        super(categoriaImovel, statusImovel, dataConstrucao, dataDisponizacao, endereco, valorSugerido, proprietarioInicial);
        this.areaM2 = areaM2;
        this.largura = largura;
        this.comprimento = comprimento;
        this.possuiAcliveDeclive = possuiAcliveDeclive;

    }
    @Override
    public String exibirDetalhes() {
        return String.format("Terreno #%d %s | Área: %.1f² | Aclive/Declive: %s | Valor: R$ %.2f | Status: %s" + getCodigo(),
                getEndereco(), areaM2, largura, comprimento, possuiAcliveDeclive ? "Sim":"Não", getValorSugirido(),getStatusImovel());
    }
}


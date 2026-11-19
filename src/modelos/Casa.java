package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;

import java.time.LocalDate;

public class Casa extends ImovelResidencial {

    public Casa(StatusImovel statusImovel, LocalDate dataConstrucao, LocalDate dataDisponibilizacao,
                Endereco endereco, double valorSugerido, ClienteProprietario proprietarioInicial,
                int qtdQuartos, int qtdSuites, int qtdSalasEstar, int qtdSalasJantar,
                int vagasGaragem, double areaM2, boolean possuiArmarioEmbutido, String descricao){
        super(CategoriaImovel.CASA, statusImovel, dataConstrucao, dataDisponibilizacao, endereco, valorSugerido,
                proprietarioInicial, qtdQuartos, qtdSuites, qtdSalasEstar, qtdSalasJantar,
                vagasGaragem, areaM2, possuiArmarioEmbutido, descricao);
    }

    @Override
    public String exibirDetalhes(){
        return String.format("[CASA #%d] %s | Área: %.1fm² | %d Quartos (%d suítes) | %d Vagas | Valor Sugerido: R$ %.2f | Status: %s | Obs: %s",
                getCodigo(), getEndereco(), areaM2, qtdQuartos, qtdSuites, vagasGaragem, getValorSugirido(), getStatusImovel(), descricao);
    }
}

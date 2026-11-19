package modelos;

import enums.CategoriaImovel;
import enums.StatusImovel;

import java.time.LocalDate;

public class SalaComercial extends Imovel{

    private double areaM2;
    private int qtdBanheiros;
    private int qtdComodos;

    public SalaComercial(CategoriaImovel categoriaImovel, StatusImovel statusImovel, LocalDate dataConstrucao,
                         LocalDate dataDisponizacao, Endereco endereco, double valorSugerido,
                         ClienteProprietario proprietarioInicial, double areaM2, int qtdBanheiros, int qtdComodos){
        super(CategoriaImovel.SALA_COMERICAL, statusImovel, dataConstrucao, dataDisponizacao, endereco, valorSugerido, proprietarioInicial);
        this.areaM2 = areaM2;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdComodos = qtdComodos;
    }

    @Override
    public String exibirDetalhes(){
        return String.format("[SALA COMERCIAL #%d] %s | Área: %.1fm | %d Banheiros | Valor: R$ %.2f | Status: %s",
                getCodigo(), getEndereco(), areaM2, qtdComodos, qtdBanheiros, getValorSugirido(), getStatusImovel());
    }
}

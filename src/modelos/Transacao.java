package modelos;

import enums.FormaPagamento;
import enums.StatusImovel;
import enums.TipoTransacao;

import java.time.LocalDate;

public class Transacao {

    private static int sequenciaContrato = 1000;
    private int numeroContrato;
    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
    private Imovel imovel;
    private ClienteUsuario clienteUsuario;
    private Funcionario funcionario;
    private double valorReal;
    private double valorImobiliaria;
    private double comissaoFuncionario;
    private FormaPagamento formaPagamento;

    public Transacao(int numeroContrato, TipoTransacao tipoTransacao, LocalDate dataTransacao,  Imovel imovel,
                     ClienteUsuario clienteUsuario, Funcionario funcionario, double valorReal, double valorImobiliaria,
                     double comissaoFuncionario, FormaPagamento formaPagamento) {
        validarTransacao(tipoTransacao, imovel, clienteUsuario);

        this.numeroContrato = numeroContrato;
        this.tipoTransacao = tipoTransacao;
        this.dataTransacao = dataTransacao;
        this.imovel = imovel;
        this.clienteUsuario = clienteUsuario;
        this.funcionario = funcionario;
        this.valorReal = valorReal;
        this.valorImobiliaria = valorImobiliaria;
        this.comissaoFuncionario = comissaoFuncionario;
        this.formaPagamento = formaPagamento;

        efetivar();
    }

    private void validarTransacao(TipoTransacao tipoTransacao, Imovel imovel, ClienteUsuario clienteUsuario){
        if(tipoTransacao == TipoTransacao.VENDA && imovel.getStatusImovel() != StatusImovel.DISPONIVEL_VENDA){
            throw new IllegalArgumentException("Imóvel não está disponível para venda.");
        }
        if(tipoTransacao == TipoTransacao.LOCACAO){
            if(imovel.getStatusImovel() != StatusImovel.DISPONIVEL_LOCACAO){
                throw new IllegalArgumentException("Imóvel não está disponível para locação.");
            }
            if(!clienteUsuario.validarRequisitosLocacao()){
                throw new IllegalArgumentException("Locação negada: o cliente usuário precisa de pelo menos 1 fiador e 2 inidicações");
            }
        }
    }

    public void efetivar(){
        imovel.setStatusImovel(tipoTransacao == TipoTransacao.VENDA ? StatusImovel.VENDIDO : StatusImovel.LOCADO);
        imovel.setDataFechamento(dataTransacao);
        funcionario.registrarTransacao(this);
    }

    public int getNumeroContrato(){
        return numeroContrato;
    }
    public double getComissaoFuncionario() {
        return comissaoFuncionario;
    }

    @Override
    public String toString(){
        return String.format("Contrato #%d [%s] | Data: %s | Imóvel #%d (%s) | Cliente: %s | Corretor: %s | Valor Real: R$ %.2f (Imobiliária: R$ %.2f / Comissão: R$ %.2f) | Pgto: %s",
                numeroContrato, tipoTransacao, dataTransacao, imovel.getCodigo(), imovel.getCategoriaImovel(),
                clienteUsuario.getNome(), funcionario.getNome(), valorReal, valorImobiliaria, comissaoFuncionario, formaPagamento);
    }

}

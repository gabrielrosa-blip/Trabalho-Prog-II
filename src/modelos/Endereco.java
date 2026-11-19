package modelos;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String numero,
                    String complemento, String bairro,
                    String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString(){
        return logradouro + ", " + numero + (complemento != null && !complemento.isEmpty() ? ", " +
                complemento : "(" + complemento + ") " + bairro + ", " + cidade + "/" + estado + "-" + cep);
    }
}

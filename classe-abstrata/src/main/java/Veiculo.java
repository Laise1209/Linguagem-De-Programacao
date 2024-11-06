public abstract class Veiculo {
    protected String nomeCliente;
    protected String marcaVeiculo;
    protected Integer anoFabricacao;

    public Veiculo(String nomeCliente, String marcaVeiculo, Integer anoFabricacao) {
        this.nomeCliente = nomeCliente;
        this.marcaVeiculo = marcaVeiculo;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void exibirRelatorio();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

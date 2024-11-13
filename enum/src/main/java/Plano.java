public enum Plano {
    BRONZE("Plano mais em conta", 80.0),
    PRATA("Plano ideal", 80.0),
    OURO("Plano mais em conta", 80.0);

    private final String descricao;
    private final Double valor;

    Plano(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}

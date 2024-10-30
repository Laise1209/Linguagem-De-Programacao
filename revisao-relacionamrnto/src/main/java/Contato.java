public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;
    private String tipoContato;
    private Double valorDoacao;

    public Contato(String nome, String telefone, String tipoContato, Double valorDoacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
        this. tipoContato = tipoContato;
        this.valorDoacao = valorDoacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public Double getValorDoacao() {
        return valorDoacao;
    }

    public void setValorDoacao(Double valorDoacao) {
        this.valorDoacao = valorDoacao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        String textoBloq = bloqueado ? "Sim" : "Não";

        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %b
                """.format(nome, telefone, textoBloq);
    }

    public void bloquear(){
        bloqueado = true;
    }

    public void desbloquear(){
        bloqueado = false;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }



}

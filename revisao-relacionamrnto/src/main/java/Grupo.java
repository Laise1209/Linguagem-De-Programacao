import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;


    public Grupo(String nome, List<Contato> contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void remover(String nomeRemover){
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);
            if(contatoDaVez.equals(nomeRemover)){
                contatos.remove(i);
            }
        }
    }

    public void removerPorTipo(String tipoRemover){
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if(contatoDaVez.getTipoContato().equals(tipoRemover)){
                contatos.remove(i);
            }
        }
    }

    public Integer getQuantidadeBloqueados() {
        Integer qtdContatos = 0;
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);
            qtdContatos = 0;
            if (contatoDaVez.getBloqueado()) {
                qtdContatos++;
            }
        }
        return qtdContatos;
    }

    public Double somaValorDoacoes(){
        Double valorSoma = 0.0;
        for (int i = 0; i < contatos.size(); i++) {
            Contato valorDaVez = contatos.get(i);
            valorSoma = 0.0;
            if (valorDaVez.getBloqueado()) {
                valorSoma+=valorDaVez.getValorDoacao();
            }
        }
        return valorSoma;
    }
}

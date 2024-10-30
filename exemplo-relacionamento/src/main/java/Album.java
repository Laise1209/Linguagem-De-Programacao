import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Integer qtdPremios;
    private List<Musica> musicas;

    public Album(String nome, Integer qtdPremios) {
        this.nome = nome;
        this.qtdPremios = qtdPremios;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);

    }

    public void exibeMusicaPorQtdLikes(Integer qtdMinimaLikes){
        //for tradicional
//        for (int i = 0; i < musicas.size(); i++) {
    //            Musica musicaDaVez = musicas.get(i);
//            if(musicaDaVez.getQtdLikes() >= qtdMinimaLikes){
//                System.out.println(musicaDaVez);
//            }
//        }

        //enhanced for
        for(Musica musicaDaVez : musicas){
            if(musicaDaVez.getQtdLikes() >= qtdMinimaLikes){
                System.out.println(musicaDaVez);
            }
        }
    }
}



public class Teste {
    public static void main(String[] args) {
        Musica musica01 = new Musica("Billie Jean", "Michael Jackson", 4.5);
        Musica musica02 = new Musica("Exagerado", "Cazuza", 2.5);

        Album album01 = new Album("Tosp 90s", 2);
        Album album02 = new Album("Favoritas", 2);

        album02.adicionarMusica(musica01);
        album01.adicionarMusica(musica02);

        musica01.curtir();
        musica01.curtir();
        musica01.curtir();

        System.out.println(musica01);
        System.out.println(musica02);

        album02.exibeMusicaPorQtdLikes(2);
    }
}

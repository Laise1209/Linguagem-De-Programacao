public class Teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro ("Bob da silva", "Fiat", 2019, 0.1, false);
        Bicicleta bicicleta01 = new Bicicleta ("xaa", "fiat", 2000, 0.1);
        Moto moto01 = new Moto ("Mel", "Top", 2023, false);

        carro01.exibirRelatorio();
        bicicleta01.exibirRelatorio();
        moto01.exibirRelatorio();
    }
}

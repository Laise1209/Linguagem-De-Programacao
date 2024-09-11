public class Teste {
    public static void main(String[] args) {
        //Instanciar um objeto
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Bob";
        bilhete01.saldo = 0.0;
        bilhete01.qtdVezesUsada = 0;
        bilhete01.codigo = "BOO1";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "José";
        bilhete02.saldo = 0.0;
        bilhete02.qtdVezesUsada = 0;
        bilhete02.codigo = "JOS1";

        bilhete02.carregar(42.8);
        System.out.println("Saaldo b1:" + bilhete01);
        Boolean deuCerto = bilhete02.usar();
        System.out.println("Deu certo? " + deuCerto);
    }
}

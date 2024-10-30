package cofrinho;

public class Main {
    public static void main(String[] args){
        Cofrinho cofrinho1 = new Cofrinho("Comprar PS5",  false);
        Cofrinho cofrinho2 = new Cofrinho("Comprar Bike",  false);
        Cofrinho cofrinho3 = new Cofrinho(false);

        Double valorResgatado = cofrinho1.quebrar();
        cofrinho2.guardar(10.0,5.0);

        if(valorResgatado == null){
            System.out.println("Já foi quebrado");
        } else{
            System.out.println("Você quebrou e resgatou " + valorResgatado);
        }

        //Mudou de ideia
        cofrinho3.setMeta("Comprar livro");
    }
}

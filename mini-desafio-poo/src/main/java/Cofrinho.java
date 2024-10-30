import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {;
    Boolean cofrinhoQuebrado;
    Double saldoCofrinho;

    void guardar(Double saldo){
        if(!cofrinhoQuebrado && saldo>0.0){
            saldoCofrinho+=saldo;
        } else{
            System.out.println("Erro no depósito");
        }
    }

    Double agitar(){
        if(!cofrinhoQuebrado){
            Double aleatorio = ThreadLocalRandom.current().nextDouble( 0, saldoCofrinho);
            saldoCofrinho -= aleatorio;
            return aleatorio;
        }
        return null;
    }

    Double quebrar() {
        if (!cofrinhoQuebrado) {
            Double valorAntes = saldoCofrinho;
            saldoCofrinho = 0.0;
            cofrinhoQuebrado = true;
            return valorAntes;
        }
        return null;
    }
}

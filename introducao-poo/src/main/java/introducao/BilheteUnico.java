package introducao;

public class BilheteUnico {
    //Boas praticas para classe:
    //1- atributos
    //2- métodos(comportamentos)
    //3-
    //4-

    //Objeto = Classe
    //Características = Atributos = Variáveis
    //Comportamento = Métod0

    //Atributos
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsada;

    //Métodos
    void carregar(Double valorRecarga){
        if(valorRecarga > 0.0){
            saldo+= valorRecarga;
            System.out.println("Recarga efetuada");
        } else{
            System.out.println("Valor inválido!");
        }
    }

    Boolean usar(){
        if(saldo >= 5){
            saldo-=5.0;
            qtdVezesUsada++;
            return true;
        }
            return false;
    }

}

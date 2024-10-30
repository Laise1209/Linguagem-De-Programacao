package cofrinho;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {;
    //private - boa pratica de encapsulamento
    private String meta;
    private Boolean cofrinhoQuebrado;
    private Double saldoCofrinho;

    public Cofrinho( String meta, Boolean cofrinhoQuebrado) {
        this.saldoCofrinho = 0.0;
        this.cofrinhoQuebrado = cofrinhoQuebrado;
        this.meta = meta;
    }

    public Cofrinho(Boolean cofrinhoQuebrado) {
        this.saldoCofrinho = 0.0;
        this.cofrinhoQuebrado = cofrinhoQuebrado;
        this.meta = "Não possui";
    }
    //Diferenças entre métodos e construtor
    //O metodo precisa especificar se tem retorno e qual é o tipo, o construtor não
    //padrão de nomenclatura: metodo-camelCase / contructor-PascalCase
    //metodo-pode ser qualquer nome / constructor-mesmo nome da classe
    //metodo-chama quando quiser / constructor-chama na instância

    //Construtor sempre tem o mesmo nome da classe

    void guardar(Double saldo){
        if(!cofrinhoQuebrado && saldo>0.0){
            saldoCofrinho+=saldo;
        } else{
            System.out.println("Erro no depósito");
        }
    }

    //Métod sobrecarregado
    void guardar(Double saldo, Double valorDesconto){
        if(!cofrinhoQuebrado && saldo>0.0){
            saldoCofrinho+=(saldo - valorDesconto);
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

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Boolean getCofrinhoQuebrado() {
        return cofrinhoQuebrado;
    }

    public Double getSaldoCofrinho() {
        return saldoCofrinho;
    }

    public void setSaldoCofrinho(Double saldoCofrinho) {
        this.saldoCofrinho = saldoCofrinho;
    }
}

public class Moto extends Veiculo{
    private Boolean possuiCapacete;

    public Moto(String nomeCliente, String marcaVeiculo, Integer anoFabricacao, Boolean possuiCapacete) {
        super(nomeCliente, marcaVeiculo, anoFabricacao);
        this.possuiCapacete = possuiCapacete;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("relatório Moto: " + nomeCliente);
        if(!possuiCapacete){
            System.out.println("Não possui caçapa");
        } else{
            System.out.println("Possui caçapa");
        }
    }

    public Boolean getPossuiCapacete() {
        return possuiCapacete;
    }

    public void setPossuiCapacete(Boolean possuiCapacete) {
        this.possuiCapacete = possuiCapacete;
    }
}

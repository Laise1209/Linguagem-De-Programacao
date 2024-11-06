public class Bicicleta extends Veiculo{
    private Double calibragemPneu;

    public Bicicleta(String nomeCliente, String marcaVeiculo, Integer anoFabricacao, Double calibragemPneu) {
        super(nomeCliente, marcaVeiculo, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatorio da bicicleta de: " + nomeCliente);

        if(calibragemPneu < 0.2){
            System.out.println("Precisa calibrar o pneu");
        } else {
            System.out.println("Tudo ok");
        }
    }

    public Double getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Double calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }
}

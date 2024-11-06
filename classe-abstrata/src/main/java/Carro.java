public class Carro extends Veiculo{
    private Double nivelOleo;
    private Boolean possuiEstep;

    public Carro(String nomeCliente, String marcaVeiculo, Integer anoFabricacao, Double nivelOleo, Boolean possuiEstep) {
        super(nomeCliente, marcaVeiculo, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiEstep = possuiEstep;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório do carro: " + nomeCliente);
        if(possuiEstep){
            System.out.println("Estep OK");
        }else{
            System.out.println("Compre um estep");
        }

        if(nivelOleo < 0.5){
            System.out.println("Nível de óleo baixo");
        } else {
            System.out.println("Nível de óleo ok");
        }
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiEstep() {
        return possuiEstep;
    }

    public void setPossuiEstep(Boolean possuiEstep) {
        this.possuiEstep = possuiEstep;
    }
}

package vehicles;

import java.util.Date;

public class Carro extends Automotor {

    /**
     * Instancia um novo objeto do tipo carro
     * @param dataDeFabricacao Data de fabricação do veículo automotor
     * @param modelo Modelo do veículo automotor
     * @param marca Marca do veículo automotor
     * @param preco Valor praticado pelo mercado em vendas deste veículo automotor
     * @param placa Placa identificadora única do veículo automotor
     * @param tipoDeCombustivel O tipo de combustível utilizado pelo veículo
     */
    public Carro(Date dataDeFabricacao, String modelo, String marca, double preco, String placa, String tipoDeCombustivel){
        super(dataDeFabricacao, modelo, marca, preco, placa); 
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    /** O tipo de combustível utilizado pelo veículo */
    private String tipoDeCombustivel;

    @Override
    public double calcularImposto() {
        //AINDA FALTA TESTAR A CONDIÇÃO SE FOR MAIS VELHO QUE 20 ANOS!!!
        int timeDiff = (int)(new Date().getTime() - getDataDeFabricacao().getTime() / (1000 * 60 * 60 * 24 * 30 * 365));
        if (timeDiff > 20) return 0;
        if ("gasolina - diesel - flex".contains(tipoDeCombustivel)) return getPreco() * 0.04;
        return getPreco() * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de combustível: " + tipoDeCombustivel;
    }
}

package vehicles;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Picape extends Automotor {

    /**
     * Instancia um novo objeto do tipo carro
     * @param dataDeFabricacao Data de fabricação do veículo automotor
     * @param modelo Modelo do veículo automotor
     * @param marca Marca do veículo automotor
     * @param preco Valor praticado pelo mercado em vendas deste veículo automotor
     * @param placa Placa identificadora única do veículo automotor
     * @param tipoDeCabine O tipo de cabine que o veículo comporta
     */
    public Picape(Date dataDeFabricacao, String modelo, String marca, double preco, String placa, String tipoDeCabine){
        super(dataDeFabricacao, modelo, marca, preco, placa); 
        this.tipoDeCabine = tipoDeCabine;
    }

    /** O tipo de cabine que o veículo comporta */
    private String tipoDeCabine;

    @Override
    public double calcularImposto() {
        //AINDA FALTA TESTAR A CONDIÇÃO SE FOR MAIS VELHO QUE 20 ANOS!!!
        int timeDiff = (int)(new Date().getTime() - getDataDeFabricacao().getTime() / (1000 * 60 * 60 * 24 * 30 * 365));
        if (timeDiff > 20) return 0;
        if (tipoDeCabine.trim() == "simples") return getPreco() * 0.02;
        return getPreco() * 0.04;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de cabine: " + tipoDeCabine;
    }
}

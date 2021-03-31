package vehicles;

import java.util.Date;

public class Carro extends Automotor {

    public Carro(Date dataDeFabricacao, String modelo, String marca, double preco, String placa, String tipoDeCombustivel){
        super(dataDeFabricacao, modelo, marca, preco, placa); 
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    private String tipoDeCombustivel;

    @Override
    public double calcularImposto() {
        if (new Date().compareTo(getDataDeFabricacao()) > 20) return 0;
        if ("gasolina - diesel - flex".contains(tipoDeCombustivel)) return getPreco() * 0.04;
        return getPreco() * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de combustível: " + tipoDeCombustivel;
    }
}

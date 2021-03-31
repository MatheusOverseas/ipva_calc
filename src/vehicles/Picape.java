package vehicles;

import java.util.Date;

public class Picape extends Automotor {

    public Picape(Date dataDeFabricacao, String modelo, String marca, double preco, String placa, String tipoDeCabine){
        super(dataDeFabricacao, modelo, marca, preco, placa); 
        this.tipoDeCabine = tipoDeCabine;
    }

    private String tipoDeCabine;

    @Override
    public double calcularImposto() {
        if (new Date().compareTo(getDataDeFabricacao()) > 20) return 0;
        if (tipoDeCabine.trim() == "simples") return getPreco() * 0.02;
        return getPreco() * 0.04;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de cabine: " + tipoDeCabine;
    }
}

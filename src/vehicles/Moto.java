package vehicles;

import java.util.Date;

public class Moto extends Automotor {
    
    Moto(Date dataDeFabricacao, String modelo, String marca, double preco, String placa) {
        super(dataDeFabricacao, modelo, marca, preco, placa);
    }

    @Override
    public double calcularImposto() {
        if (new Date().compareTo(getDataDeFabricacao()) > 20) return 0;
        return getPreco() * 0.02;
    }
}

import java.util.Date;
import vehicles.*;

public class App {
    public static void main(String[] args) throws Exception {

        Date fabDate = new Date();
        
        Carro carro = new Carro(fabDate, "IDK", "IDK Cars", 54699.99, "4002ABC", "gasolina");
        System.out.println("O carro deve pagar R$" + carro.calcularImposto() + " de impostos.\n" + carro.toString());

        Moto moto = new Moto(fabDate, "IDK", "IDK Cars", 24999.00, "8922XYZ");
        System.out.println("A moto deve pagar R$" + moto.calcularImposto() + " de impostos.\n" + moto.toString());
        
        Picape picape = new Picape(fabDate, "IDK", "IDK Cars", 101599.50, "5050BLS", "simples");
        System.out.println("A picape deve pagar R$" + picape.calcularImposto() + " de impostos.\n" + picape.toString());
    }
}

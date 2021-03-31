package veiculos;

import java.util.Date;

abstract class Automotor {

    /**
     * Instancia um novo veículo automotor
     * @param dataDeFabricacao Data de fabricação do veículo automotor
     * @param modelo Modelo do veículo automotor
     * @param marca Marca do veículo automotor
     * @param preco Valor praticado pelo mercado em vendas deste veículo automotor
     * @param placa Placa identificadora única do veículo automotor
     */
    Automotor(Date dataDeFabricacao, String modelo, String marca, double preco, String placa){
        this.dataDeFabricacao = dataDeFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.placa = placa;
    };

    /**Data de fabricação do veículo automotor.*/
    private Date dataDeFabricacao;

    /**
     * @return Retorna a data de fabricação do veículo automotor
     */
    public Date getDataDeFabricacao() { return dataDeFabricacao; }



    /**Modelo do veículo automotor.*/
    private String modelo;

    /**
     * @return Retorna o modelo do veículo automotor
     */
    public String getModelo() { return modelo; }
    


    /**Marca do veículo automotor.*/
    private String marca;

    /**
     * @return Retorna a marca do veículo automotor
     */
    public String getMarca() { return marca; }

    

    /**Valor praticado pelo mercado em vendas deste veículo automotor.*/
    private double preco;

    /**
     * @return Retorna o valor praticado pelo mercado em vendas deste veículo automotor.
     */
    public double getPreco() { return preco; }

    /**
     * Atribui o preço especificado à propriedade price
     * @param preco : O valor a ser atribuído.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }


    
    /**Placa identificadora única do veículo automotor.*/
    private String placa;

    public String getPlaca() { return placa; }



    /**
     * Calcula o valor do imposto de acordo com as especificações do veículo automotor.
     * @return Retorna o valor do imposto.
     */
    abstract public double calcularImposto();

    public String toString(){
        String summup = "AUTOMOTOR:\n";
        summup += "Modelo: " + modelo + "\n";
        summup += "Marca: " + marca + "\n";
        summup += "Preço: R$" + preco + "\n";
        summup += "Data de fabricação: " + dataDeFabricacao.toString() + "\n";
        summup += "Placa: " + placa + "\n";
        return summup;

    }
}

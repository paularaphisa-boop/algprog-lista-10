public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, String cor, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    public void frear() {
        System.out.println("Carro freando.");
    }

    public void estacionar() {
        System.out.println("Carro estacionado.");
    }
}

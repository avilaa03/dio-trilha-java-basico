public class Carro extends Veiculo{
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
    public void confereCombustivel() {
        System.out.println("Carro Confere Combustivel");
    }

    public void confereCambio() {
        System.out.println("Carro Confere Cambio em P");
    }
}

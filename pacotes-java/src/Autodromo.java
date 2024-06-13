public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("E9231019");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}

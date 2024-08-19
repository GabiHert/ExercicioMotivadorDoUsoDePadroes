public class App {
    public static void main(String[] args) throws Exception {

        Motor motor = MotorFactory.Factory(TipoCombustivel.FLEX, 6,8);
        Carro suvFLEX = new Carro("suvFlex", TipoCombustivel.FLEX, motor,65);

        System.out.println("\n\n\n\n-----------//////------------\n");

        System.out.println("Tipos de veiculos:");
        System.out.println(suvFLEX);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro suv com gasolina");
        suvFLEX.abastece(TipoCombustivel.ALCOOL, 55);
        System.out.println(suvFLEX);
        System.out.println("\nViajando com o carro utilitario");
        suvFLEX.viaja(250);
        suvFLEX.viaja(150);
        System.out.println(suvFLEX);
    }
}

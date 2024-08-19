
public class MotorFactory {
    static Motor Factory(TipoCombustivel tipoCombustivo, int consumo){
        Motor motor = new Motor(tipoCombustivo);
        motor.setConsumo(consumo);
        return motor;
    };

    static Motor Factory(TipoCombustivel tipoCombustivel,int consumo1, int consumo2 ){
        return new MotorFlex(consumo1,consumo2);
    }
};

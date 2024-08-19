
public class MotorFlex extends Motor {
    private int consumoAlcool;
    private int consumoGasolina;
    MotorFlex(int consumoAlcool, int consumoGasolina){
        super(TipoCombustivel.FLEX);
        this.consumoAlcool = consumoAlcool;
        this.consumoGasolina = consumoGasolina;
    }

    @Override
    public int getConsumo(TipoCombustivel tipoCombustivel){
        if(tipoCombustivel.equals(TipoCombustivel.ALCOOL)){
            return consumoAlcool;
        }
        return consumoGasolina;
    }

    @Override
    public String toString() {
        return "Motor [consumoGasolina=" + consumoGasolina + ", consumoAlcool=" + consumoAlcool + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}
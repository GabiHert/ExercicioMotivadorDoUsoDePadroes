public class Motor {

    protected TipoCombustivel tipoMotor;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    protected int quilometragem;

    public Motor(TipoCombustivel tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getConsumo(TipoCombustivel tipoCombustivel) {
        return this.consumo;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia, TipoCombustivel tipoCombustivel) {
        return distancia / this.getConsumo(tipoCombustivel);
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + this.getConsumo(tipoMotor) + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}
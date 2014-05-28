package consumo_combustivel;

public class CalculosDeConsumo {

    public double calcularRendimentoPorLitro(double distanciaPercorridaKm, double litrosDecombustivelGasto){
        return distanciaPercorridaKm / litrosDecombustivelGasto;
    }
}

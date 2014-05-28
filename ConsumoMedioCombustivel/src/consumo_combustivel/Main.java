package consumo_combustivel;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String distanciaPercorridaStr = JOptionPane.showInputDialog("Informe a distância percorrida (KM): ");
        double distanciaPercorrida = Double.parseDouble(distanciaPercorridaStr);
        
        String consumoEmLitrosStr = JOptionPane.showInputDialog("Informe o consumo total de combustível (L): ");
        double consumoEmLitros = Double.parseDouble(consumoEmLitrosStr);
        
        CalculosDeConsumo calculos = new CalculosDeConsumo();
        double rendimento = calculos.calcularRendimentoPorLitro(distanciaPercorrida, consumoEmLitros);
        System.out.println("O rendimento é " + rendimento + " km/l");
        
    }

}

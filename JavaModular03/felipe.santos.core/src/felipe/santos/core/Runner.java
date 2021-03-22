package felipe.santos.core;

import felipe.santos.utils.operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma 5 + 3 = " + calculadora.somar(5, 3));
    }
}

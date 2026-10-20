public class Main {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        System.out.println("");
        System.out.println("evaluacion de metodos de integracion numerica");
        System.out.println("funcion: f(x) = x^2 | intervalo: [" + a + " , " + b +"]");
        System.out.println("tolerancia: " + tolerancia);
        System.out.println("");

        // Mandamos a llamar al método encapsulado
        double resultado = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("\nResultado final (trapecio compuesto): " + resultado);

        double resultadoSimpson = SimpsonCompuesto.integrarConTolerancia(a,b,tolerancia);
        System.out.println("\nResultado final (simpson 1/3 compuesto) " + resultadoSimpson);
    }
}
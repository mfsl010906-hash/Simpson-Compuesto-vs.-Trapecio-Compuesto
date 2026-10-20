public class SimpsonCompuesto {
    /**
     * Calcula la aproximación de la integral mediante la Regla de Simpson 1/3 Compuesta.
     * Fórmula: I = (h / 3) * [ f(a) + 4*sum(f(x_impares)) + 2*sum(f(x_pares)) + f(b) ]
     */
    private static double calcularSimpson(double a, double b, int n) {
        double h = TrapecioCompuesto.calcularH(a, b, n);
        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        // Ciclo para evaluar los puntos interiores x_k
        for (int k = 1; k < n; k++) {
            double xk = a + k * h;

            if (k % 2 != 0) {
                sumaImpares += TrapecioCompuesto.funcion(xk);
            } else {
                sumaPares += TrapecioCompuesto.funcion(xk);
            }
        }
        // Suma final aplicando la fórmula del método
        double sumaTotal = TrapecioCompuesto.funcion(a)
                + 4 * sumaImpares
                + 2 * sumaPares
                + TrapecioCompuesto.funcion(b);

        return (h / 3.0) * sumaTotal;
    }

    /**
     * Evalúa la convergencia iterativa duplicando n hasta cumplir con la tolerancia especificada.
     */
    public static double integrarConTolerancia(double a, double b, double tolerancia) {
        int n = 2; // n inicial debe ser par (n = 2)
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        System.out.println("iteracciones simpson 1/3 compuesto ");
        System.out.println("n = " + n + " | Integral = " + integralAnterior);

        while (errorAbsoluto > tolerancia) {
            n *= 2; // Duplica los subintervalos (mantiene n siempre par)
            double integralNueva = calcularSimpson(a, b, n);

            errorAbsoluto = Math.abs(integralNueva - integralAnterior);

            System.out.println("n = " + n + " | Integral = " + integralNueva + " | Error = " + errorAbsoluto);

            integralAnterior = integralNueva;
        }

        return integralAnterior;
    }
}
# Práctica: Integración Numérica (Trapecio Compuesto vs. Simpson 1/3 Compuesto)

**Asignatura:** Métodos Numéricos  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa - Ingeniería en Sistemas Computacionales  
**Alumna:** Maria Fatima Sanchez Landa 
---

## Descripción
Este repositorio contiene la implementación en Java de los métodos de integración numérica:
* **Regla del Trapecio Compuesto**
* **Regla de Simpson 1/3 Compuesta**

Ambos métodos evalúan la convergencia iterativa mediante duplicación de subintervalos hasta alcanzar una tolerancia especificada.

---

## Requisitos y Compilación

### Requisitos:
* Java Development Kit (JDK) 8 o superior.

### Pasos para compilar y ejecutar desde la terminal:

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/tu_usuario/tu_repositorio.git](https://github.com/tu_usuario/tu_repositorio.git)
   cd tu_repositorio
   ```

2. Compilar el código:
   ```bash
   javac -d bin src/dif_e_Integracion/*.java
   ```

3. Ejecutar la clase principal:
   ```bash
   java -cp bin dif_e_Integracion.Main
   ```

---

## Ejemplo de Salida en Consola

```text
=============================================
  EVALUACIÓN DE MÉTODOS DE INTEGRACIÓN NUMÉRICA
  Función: f(x) = x^2  | Intervalo: [0.0, 2.0]
  Tolerancia: 0.0001
=============================================

--- ITERACIONES (TRAPECIO COMPUESTO) ---
n = 2 | Integral = 2.75
n = 4 | Integral = 2.6875 | Error = 0.0625
n = 8 | Integral = 2.671875 | Error = 0.015625
n = 16 | Integral = 2.66796875 | Error = 0.00390625
n = 32 | Integral = 2.6669921875 | Error = 0.0009765625
n = 64 | Integral = 2.666748046875 | Error = 0.000244140625
n = 128 | Integral = 2.66668701171875 | Error = 6.103515625E-5

-> Resultado Final (Trapecio Compuesto): 2.66668701171875

--- ITERACIONES (SIMPSON 1/3 COMPUESTO) ---
n = 2 | Integral = 2.6666666666666665
n = 4 | Integral = 2.6666666666666665 | Error = 0.0

-> Resultado Final (Simpson 1/3 Compuesto): 2.6666666666666665
```

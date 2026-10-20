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
   git clone [https://github.com/mfsl010906-hash/Simpson-Compuesto-vs.-Trapecio-Compuesto.git)
   cd Simpson-Compuesto-vs.-Trapecio-Compuesto
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
evaluacion de metodos de integracion numerica
funcion: f(x) = x^2 | intervalo: [0.0 , 2.0]
tolerancia: 1.0E-4
--- ITERACIONES (TRAPECIO COMPUESTO) ---
n = 2 | Integral = 3.0
n = 4 | Integral = 2.75 | Error = 0.25
n = 8 | Integral = 2.6875 | Error = 0.0625
n = 16 | Integral = 2.671875 | Error = 0.015625
n = 32 | Integral = 2.66796875 | Error = 0.00390625
n = 64 | Integral = 2.6669921875 | Error = 9.765625E-4
n = 128 | Integral = 2.666748046875 | Error = 2.44140625E-4
n = 256 | Integral = 2.66668701171875 | Error = 6.103515625E-5

Resultado final (trapecio compuesto): 2.66668701171875

iteracciones simpson 1/3 compuesto 
n = 2 | Integral = 2.6666666666666665
n = 4 | Integral = 2.6666666666666665 | Error = 0.0

Resultado final (simpson 1/3 compuesto) 2.6666666666666665

```
## conclucion


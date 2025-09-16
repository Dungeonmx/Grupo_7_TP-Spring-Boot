package ar.edu.unlpam.tp.SpringBootEj2.model;

public class PrimoChecker {
  public boolean esPrimo(int numero) {
    if (numero <= 1)
      return false; // 0, 1 y negativos no son primos
    if (numero == 2)
      return true; // 2 es primo
    if (numero % 2 == 0)
      return false; // pares > 2 no son primos

    // solo verifica hasta la raíz cuadrada
    for (int i = 3; i <= Math.sqrt(numero); i += 2)
      if (numero % i == 0)
        return false;

    return true;
  }
}

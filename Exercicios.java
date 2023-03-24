package Avaliacaojava;

import java.util.Scanner;

public class Exercicios {
  Scanner sc = new Scanner(System.in);

  public void numeros() {
    System.out.println("escolha o numero um !!!");
    double numero1 = sc.nextDouble();
    System.out.print("Escolha o numero dois!!!");
    double numero2 = sc.nextDouble();
    System.out.println("1-Adição+ ");
    System.out.println("2-Subtração- ");
    System.out.println("3-Multiplicação* ");
    System.out.println("4-Divisão/");
    System.out.println("selecione a operação adequada");
    int operação = sc.nextInt();
    double resultado = 0;
    switch (operação) {
      case 1:
        resultado = numero1 + numero2;
        break;
      case 2:
        resultado = numero1 - numero2;
        break;
      case 3:
        resultado = numero1 * numero2;
        break;
      case 4:
        resultado = numero1 / numero2;
        break;

    }
    System.out.println("resultado final: " + resultado);
  }


}

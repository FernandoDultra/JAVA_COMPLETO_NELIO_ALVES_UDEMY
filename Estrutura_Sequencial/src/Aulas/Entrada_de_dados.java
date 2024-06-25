package Aulas;

import java.util.Scanner;

public class Entrada_de_dados {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma palavra: ");

      // Ler palavra sem espaço
      String nome = sc.next();
      System.out.println("Voce digitou: " + nome);

      // ler um número inteiros

      System.out.println("Digite um número inteiro: ");
      int idade = sc.nextInt();
      System.out.println("Voce digitou: " + idade);

      // Ler com pontos flutantes ( não esquecer que o sistema está em PT-Br.)

      System.out.println("Digite um número com ponto flutuante: ");
      double num = sc.nextDouble();
      System.out.println("Voce digitou: " + num);

      // ler caractere
      char z;
      System.out.println("Digite uma Palavra");
      z = sc.next().charAt(0); // charAt 0 pega o primeiro caractere de uma string
      System.out.println("Voce digitou: " + z);

      // Ler varios dados na mesma linha

      String x;
      int y;
      double u;

      x = sc.next();
      y = sc.nextInt();
      u = sc.nextDouble();

      System.out.println("dados que você digitou: ");
      System.out.println(x);
      System.out.println(y);
      System.out.println(u);




      sc.close();
  }
}

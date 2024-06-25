package Aulas;

import java.util.Scanner;

public class Entrada_de_dados_2 {
    public static void main(String[] args) {
        // Ler um texto até a quebra de Linha

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;

        int x;

        x = sc.nextInt();
        sc.nextLine(); // Limpando o buffer de leitura
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados");
        System.out.println(x);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // Quebra de linha pendente




        sc.close();


    }
}

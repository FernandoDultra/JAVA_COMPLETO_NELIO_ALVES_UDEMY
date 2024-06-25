/*Em um novo programa, inicie as  seguintes variáveis:
String productl = "Computer" ;
String product2 = "Office desk" ;
age = 3e;
int code = 529a;
char gender =
double pricel
= 21ee.e;
double price2 —
- se. se;
double measure
= 53.234567;
Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
Products :
Computer, which Price is $
Office desk, which Price is $ 659, se
Record: 3a years old, code 529 and gender: F
Measue with eight decimal places: 53,234567ee
Rouded (three decimal places): 53, 235
US decimal point: 53.235 */
package Exercicios;

import java.util.Locale;

public class ex_01 {

public static void main(String[] args) {

    // iniciando as variáveis

    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    // Gerando as saídas

    System.out.println("Products:");
    System.out.printf("%s, wich price is %.2f\n",product1, price1);
    System.out.printf("%s, wich price is %.2f\n",product2, price2);

    System.out.printf("Record: %d years old, code %d and gender: %c\n",age,code,gender);

    System.out.printf("Neasue wutg eight decimal places: %.8f\n",measure);
    System.out.printf("Rouded (three decimal places): %.3f\n",measure);

    Locale.setDefault(Locale.US);

    System.out.printf("US Decimal point: %.3f\n",measure);

    }
}

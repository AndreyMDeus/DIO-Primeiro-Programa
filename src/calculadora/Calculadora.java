package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer a, b;
        System.out.println("Informe o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Os valores somados resultam em " + somar);
        System.out.println("Os valores subtraidos resultam em " + subtrair);
        System.out.println("Os valores multiplicados resultam em " + multiplicar);
        System.out.println("Os valores divididos resultam em " + dividir);

        scan.close();

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return a / b;
    }
}

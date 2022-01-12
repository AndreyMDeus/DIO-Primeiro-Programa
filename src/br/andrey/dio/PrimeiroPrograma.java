package br.andrey.dio;

import br.andrey.classes.Carro;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("Olá todo mundo! e a soma de " + a + " e " + b + " é igual a " + (a + b));

        Carro carro = new Carro();

        carro.setNome("Ford KA");
        carro.setNomeMontadora("FORD");
        carro.setAno(2009);

        System.out.println(carro);

    }
}
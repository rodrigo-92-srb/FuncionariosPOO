package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", 3000);
        Gerente g1 = new Gerente("Ana", 5000, 1000);

        System.out.println(f1.nome + " - Bônus: " + f1.calcularBonus());
        System.out.println(g1.nome + " - Bônus: " + g1.calcularBonus());
    }
}
package com.calculadoraimc;
import java.util.Scanner;


public class calculadoraImc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu peso");
        double peso = leitor.nextDouble();
        System.out.println("Insira sua altura");
        double altura = leitor.nextDouble();
        
        double imc = (peso/(altura * altura));
         String imcFormatado = String.format("%.2f", imc);
        
        if (imc > 30) {
            System.out.println("\nIMC: " + imcFormatado + " Classificação: Obesidade");   
      } else if (imc >= 25 && imc < 30) {
            System.out.println("\nIMC: " + imcFormatado + " Classificação: Sobrepeso");
        } else if (imc < 18.5) {
            System.out.println("\nIMC: " + imcFormatado + " Classificação: Baixo peso");
        } else {
            System.out.println("\nIMC: " + imcFormatado + " Classificação: Peso normal");
        }
    }
}
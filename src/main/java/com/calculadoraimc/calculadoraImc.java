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
        
         if (peso < 0 || altura < 0) {
            System.out.println("Digite um valor válido!!");   
      } else if (imc > 30) {
            System.out.println("\nIMC: " + imcFormatado + " Classificacao: Obesidade");   
      } else if (imc >= 25) {
            System.out.println("\nIMC: " + imcFormatado + " Classificacao: Sobrepeso");
        } else if (imc < 18.5) {
            System.out.println("\nIMC: " + imcFormatado + " Classificacao: Baixo peso");
        } else {
            System.out.println("\nIMC: " + imcFormatado + " Classificacao: Peso normal");
        }
    }
}

package sp.senai.br.javaprojeto;
import java.util.Arrays;
import java.util.Scanner;

public class simasTurbo {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); {
            
        System.out.println("Quantos números deseja inserir?");           
            int quantidade = teclado.nextInt();
            
            double[] numeros = new double[quantidade];
            
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o número" + (i + 1) + ": \n");
                numeros[i] = teclado.nextDouble();
            }
                        
            double maior = numeros[0];
            double menor = numeros[0];
            double soma = numeros[0];
            
            for (int i = 1; i < quantidade; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
                soma += numeros[i];
            }

            double media = soma / quantidade;
            
            Arrays.sort(numeros);
            
     
            double mediana;
            if (quantidade % 2 == 0) {
                mediana = (numeros[quantidade / 2 - 1] + numeros[quantidade / 2]) / 2;
            } else {
                mediana = numeros[quantidade / 2];
            }
           
            System.out.println("\n Maior número:" + maior);
            System.out.println("\n Menor número:" + menor);
            System.out.println("\n Média:" + media);
            System.out.println("\n Mediana:" + mediana);
              
        }
    }
}
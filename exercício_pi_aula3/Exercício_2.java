  //       EXERCÍCIO  1
  // Escreva um algoritmo que implemente um array de objetos do tipo pessoa,
  // onde pessoa é uma classe que tem os atributos
  // nome(String), idade(Int) e cpf(long).
  //       EXERCÍCIO  2
  // Escreva um método que receba dois valores float, como parâmetros 
  // e retorne a soma desses valores

package exercício_pi_aula3;

import java.util.Scanner;

public class Exercício_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float num1 = leitor.nextFloat();
        float num2 = leitor.nextFloat();
        
        System.out.println(somaFloat(num1, num2));
    }
    public static float somaFloat(float num1, float num2){
        return num1 + num2;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_pi_aula3;

import java.util.Scanner;

/**
 *
 * @author starc
 */
public class ArrayPessoa {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[5];// Array do tipo Pessoa
        
        for(int i=0; i<pessoa.length;i++){
            pessoa[i] = new Pessoa();
        }
        
        for(int i=0; i<pessoa.length;i++){
            System.out.println("Nome da "+(i+1)+"º pessoa:");
            pessoa[i].nome   = leitor.next();
            System.out.println("Idade da "+(i+1)+"º pessoa:");
            pessoa[i].idade = leitor.nextInt();
            System.out.println("CPF da "+(i+1)+"º pessoa:");
            pessoa[i].CPF = leitor.nextLong();
        }
        
        for(int i=0; i<pessoa.length;i++){
            System.out.println("\nNome da "+(i+1)+"º pessoa: "+pessoa[i].nome);
            System.out.println("Idade da "+(i+1)+"º pessoa: "+pessoa[i].idade);
            System.out.println("CPF da "+(i+1)+"º pessoa: "+pessoa[i].CPF);
            System.out.println("===========");
        }
    }
}
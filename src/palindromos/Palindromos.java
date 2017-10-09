/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

import java.util.Scanner;

/**
 *
 * @author JorgeRicardo
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack <Character> pila2 = new Stack<>();
        String var;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase o palabra");
        var = teclado.nextLine();
        char[] result = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        //metodo para eliminar espacios y numeros
        char [] reversed = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        
        invierteArreglo(reversed,pila2);
        String rev = String.valueOf(reversed);
        String res = String.valueOf(result);
        compareString(rev,res);
    }
    
    public static char[] invierteArreglo(char[] result,Stack<Character> pila2){
        char [] reversed = result;
        for (int i = 0; i < result.length; i++){
            pila2.push(result[i]);
        }
        for (int i = 0; i < result.length; i++) {
            reversed[i]=pila2.pop();
        }
        return reversed;
    }
    
    public static void showArray(char[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void compareString(String n, String r){
        if (n.equals(r)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}

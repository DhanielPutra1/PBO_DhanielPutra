/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhan1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L27922_2 {
    public static void main(String[]args){
        
        int n,i;
        int jum=0;
        float ra;
        Scanner input = new Scanner(System.in);
        System.out.print("Input  batas = ");n = input.nextInt();
        i=1;
        int ta;
        while (i <= n)
        {
            System.out.print(i+"\t");
            jum = jum +i;
            i++;
        }
        ra = jum / n;
        System.out.println(ra+"\n");
        
        while (i >1)
        {
            System.out.print(i+"\t");
            i--;
        }
        
    }
}

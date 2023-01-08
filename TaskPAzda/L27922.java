/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhan1;

import java.awt.BorderLayout;

/**
 *
 * @author User
 */

   import java.util.Scanner;
 
public class L27922 
{
    public static void main(String[] args)
	{
            int i,n,ni;
            float ra;
            Scanner input = new Scanner(System.in);
            System.out.print("Input Jumlah Data = ");n = input.nextInt();
			
            i=1;
            int jum = 0;
            
             for (i=0;i<n;i++)
             {
                 System.out.print(i+"\t");
                 jum = jum +i;
             }
             System.out.println("");
             for (i=n;i>0;i--)
             {
                 System.out.print(i+"\t");
             }
             ra = jum /n;
             System.out.print("rata-rata = " +ra);
             
             
             
        }
    
}

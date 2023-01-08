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
public class Test1 {
    String name;
    int i,n;
    
    Scanner input = new Scanner(System.in);
    
    
    public void data(){
        
        System.out.print("Input Jumlah mahasiswa = "); n = input.nextInt();
        
        
            if(n <3)
            {
                for (i = 0; i < n; i++) 
                {       
                  System.out.print("Nama :");String name = input.next();
                }
            }
            else 
            {
                System.out.println("Jumlah yang anda inputkan terlalu banyak");
            }
        }
        
        
    }
    
    


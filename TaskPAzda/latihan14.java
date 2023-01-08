/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhan1;

/**
 *
 * @author User
 */
/* Nama   : Dhaniel Putra A 
   NIM    : 2101092043
   Program: program yang menghitung serta menampilkan besar diskon
*/

    import java.util.Scanner;
	
	public class latihan14
	{
		 public static void main(String[] args)
		 {
		   Scanner input = new Scanner(System.in);
		   
		   int harga;int diskon;int hsdiskon;int total;int diskon1;
		   
		   System.out.print("Masukkan Jumlah Belanja = ");harga = input.nextInt();
		   
		     	   
		if (harga >= 100000)
		   { 
	         diskon1 = harga * 10 /100;
			 total= harga-diskon1;
			
			 
            System.out.println("Anda mendapatkan Diskon Sebesar 10%");	
            System.out.println("Total Belanja Anda Sebelum Diskon Rp." + harga + ",-");
	        System.out.println("Diskon yang didapat Sebesar = Rp. " + diskon1 + ",-" );
			System.out.println("\n===========================================\n");
			System.out.println("Total yang harus bibayar = Rp." +total+",-" );			 
		   }
		   else 
		   {
		    System.out.println("\nAnda Tidak Mendapatkan Diskon");
			System.out.println("===========================================");
			System.out.println("Total yang harus bibayar = Rp." + harga +",-");
		   }
		 }
	}
			
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhan1;

/**
 *
 * @author User
 */
public class Latihan12 {
    public static void main(String[] args) {
       int[][] numbers = {{1, 2, 3}, 
 {4, 5, 6}, 
 {7, 8, 9}}; 
 
int searchNum = 5; 
boolean foundNum = true; 
 
searchLabel: 
for( int i=0; i<numbers.length; i++ ){ 
 for( int j=0; j<numbers[i].length; j++ ){ 
 if( searchNum == numbers[i][j] ){ 
 foundNum = false; 
 break searchLabel; 
 } 
 } 
} 
 
if( foundNum ){ 
 System.out.println( searchNum + " found!" ); 
} 
else{ 
 System.out.println( searchNum + " not found!" ); 
}}}

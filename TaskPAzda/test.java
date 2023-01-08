/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhan1;

import Dhann.Peminjaman;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Peminjaman pinjam=new Peminjaman();
        
        String nama,kode,tgl;
        double jmlhPinjam,angsuran,bunga;
        int lamaPinjam;
        
        System.out.print("Masukkan Kode Pinjam : ");
        kode=in.nextLine();
        System.out.print("Masukkan Nama Nasabah : ");
        nama=in.nextLine();
        System.out.print("Masukkan Tanggal Peminjaman : ");
        tgl=in.nextLine();
        System.out.print("Masukkan Jumlah Peminjaman : ");
        jmlhPinjam=in.nextDouble();
        System.out.print("Masukkan Lama Peminjaman(Tahun) : ");
        lamaPinjam=in.nextInt();
        
        
        pinjam.Kode(kode,nama,tgl);
       
        pinjam.JumlahPinjam(jmlhPinjam);
        pinjam.LamaPinjam(lamaPinjam);
        
        pinjam.print(pinjam.Kode(),pinjam.Nama(),pinjam.Tgl(),pinjam.JumlahPinjam(),pinjam.LamaPinjam(),pinjam.Bunga(),pinjam.Angsuran());
    }
}
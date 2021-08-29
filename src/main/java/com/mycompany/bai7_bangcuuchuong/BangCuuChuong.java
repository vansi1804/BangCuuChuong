/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bai7_bangcuuchuong;

/**
 *
 * @author FPTSHOP
 */
public class BangCuuChuong {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            //System.out.print("\n\n\t\tCuu chuong "+i+": ");
            System.out.println("");
            for(int j = 1; j <= 10; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t   ");
            }
        }
    }
}

package com.mycompany.bai7_bangcuuchuong;

public class BangLuyThua {
    public static void main(String[] args) {
        int Num = 6;
        for (int i = 1; i <= Num; i++) {
            for (int j = 1; j <= Num; j++) {
                System.out.print(j+"^"+i+" = "+Math.pow(i,j)+"\t");
            }
            System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thenumberofsales;

/**
 *
 * @author Noxolo
 */
public class TheNumberOfSales {

    public static void main(String[] args) {
String City = "CAPE TOWN";
        int[]PS5={100,2000,1500};
        int[]XBOX={2000,3000,1100};        
        int[]SWITCH={3000,4000,1200}; 
        String fmtHeader= "%-10s%-10s%-10s%-10s%n";
       String fmtRowInt= "%-10s%-10d%-10d%-10d%n";
       String line = "--------------------------------------";
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);
        System.out.println(City);
        System.out.println((PS5,XBOX,SWITCH);
        for (int i = 0; i < city.length;i++){
        System.out.printf(fmtRowInt,PS5[i], XBOX[i], SWITCH[i]);
        
}
System.out.println(line);
System.out.println("CONSOLE SALES FOR EACH CITY");
System.out.printf(fmtRowInt,"TOTAL:",sum(CAPE TOWN));
System.out.println("CITY WITH THE MOST SALES: PORT ELIZABETH");
    }
    static int sum(int[]arr){
    int total = 0;
    for (int val : arr){
        total += val;
    }
    return total;
}}

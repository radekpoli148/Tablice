/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablice;

public class Tablice {
   
    public static void main(String[] args) {
        
        int[] tab;//inicjacja tablicy
        
        tab = new int[5];//rezerwacja miejsca w pamięci
        
        int[] tab2 = new int[10]; //inicjacja z rezerwacją w jednej linii
        
        int[] tab3 = {1, 2, 64, 6, 243, 5567}; //inicjacja z przypisaniem wartości
        
        System.out.println(tab3[tab3.length-1]); //wypisanie ostatniego elementu tablicy
        
        //tablice wielowymiarowe
        
        int[][] tab4 = new int[4][3]; //1 argument - wiersze, 2 argument - kolumny
        
        int[][] tab5 =
        {
            {4, 31, 3},
            {55, 343, -21},
            {34, 432, 88}
        };
        System.out.println(tab5[2][2]);
    }
    
}

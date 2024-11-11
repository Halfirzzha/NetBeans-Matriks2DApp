/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzzha.matriks2d;

/**
 *
 * @author halfirzzha
 */
public class Matriks2D {
    int[][] A = { {3, 7, 5}, {2, 8, 6} };

    public void cetak() {
        System.out.println("Matrik A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriks2D matrix = new Matriks2D();
        matrix.cetak();
    }
}

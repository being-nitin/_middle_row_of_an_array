package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to print the middle row of an array:
    Scanner sc = new Scanner(System.in);
    int amr[][] = new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            amr[i][j] = sc.nextInt();;
        }
    }
    // middle row means, that row number should by 1 in 3x3 matrix
    int k =1;
    for(int i=0;i<3;i++){
        System.out.println(amr[k][i]);
    }


    }
}

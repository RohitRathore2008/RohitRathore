package arrays_and_methods;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_array {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[][] = new int[size][size];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("Enter i =" + i + " and j =" + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//


//        int arr[][] = {{1,2,3},{4,5,6}, {7,8,9}};
//
//        int row = arr.length , col = arr[0].length;
//        int arr2[][] = new int[col][row];
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr2[j][i] = arr[i][j];
//            }
//
//        }
//


//        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int target = 4;
//             int row = arr.length,col = arr[0].length;
//              boolean istarget = false;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if(arr[i][j] == target){
//                    istarget = true;
//                }
//            }
//        }
//        System.out.println(istarget);


int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
int row = arr.length;
int col = arr[0].length;
int arr2[][] = new int[col][row];
      //transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col-1-j ; j++) {
                int temp = arr2[i][j];
                arr2[i][j] = arr2[i][col-1-j];
                arr2[i][col-1-j] = temp;
            }
        }
        for (int i = 0; i < row ; i++) {
                System.out.println(Arrays.toString(arr2[i]));
            }






















































    }
}

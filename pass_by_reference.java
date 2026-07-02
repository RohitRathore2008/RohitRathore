package arrays_and_methods;

import java.util.Arrays;

import static arrays_and_methods.Methods.solve;

public class pass_by_reference {
    static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        System.out.println("Before calling...");
//        change(arr);
//        System.out.println("After calling ...");
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void change(int arr[]){
//        arr[2] = 69; // update
        // Java does not support pass by reference it supports pass by value;
        // arr = new int[3];
        // arr[2] = 3; line 16 aur 17 change h aur isse array change ni hoga


        // Varargs = variable length arguments

        solve(1, 2, 3, 4, 5);
    }
    public static void solve(int i , int ...arr){
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
















}}













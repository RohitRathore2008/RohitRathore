package arrays_and_methods;

import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {
        //ARRAY = array is a linear data structure that stores elements of same data type in contiguous memory locations.
        // Agar ham sequential order me jate h to ham use linear bolte h.
        // contiguous ka mtlb jo element hota h wo 1 he jgah pr hota h aur non contiguous me element 1 jgah nhi hota alag alag hota h
        // array contiguous hote h aur linkedlist non contiguous hote h .
        // in array hame size pehle se btana pdta h which is a drawback for array.


        // syntax
        /*int arr[] = new int[10];
        int []arr2 = new int[120];
        int arr3[] = {1,2,3,4,5,6,7};
        int arr4[] = new int[]{1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        int arr[] = {1,2,3,4,5};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
               if(max < arr[i]){
                   max = arr[i];
                   maxIndex = i;
               }

        }
        System.out.println("the max element is = " + max + " and max index is = " + maxIndex );

        int arr[] = {1,2,3,4,5};
        int max = arr[0];
        int max2 = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(max < arr[i]){
                max2 = max;
                max = arr[i];
            }else if(max2 < arr[i]){
                max2 = arr[i];
            }

        }
        System.out.println("Max = " + max + " 2nd Max =" + max2);


        int arr[] = {5,8,10,};
        String issorted = "sorted";

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                issorted = "not sorted";
                break;
            }
        }
        System.out.println(issorted);
          int size = 5;
        int arr[] = {1,2,3,4,5};
        int n = size;

        for (int i = n-1; i >= 0  ; i--) {
            System.out.println(arr[i]);
        }*/

//        int arr[] = {1,23,4,5,2};
//        int start = 0 , end = arr.length-1;
//
//        while(start<end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++ ;
//            end--;
//        }
//        System.out.println(java.util.Arrays.toString(arr));

//        int arr[] = {1,2,3,4,5};
//        int temp = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//                 arr[i-1] = arr[i] ;
//        }
//        arr[arr.length-1] = temp;
//        System.out.println(java.util.Arrays.toString(arr));





















    }
}

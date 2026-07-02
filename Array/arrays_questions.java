
package arrays_and_methods;

import java.util.Arrays;
import java.util.Scanner;

import static arrays_and_methods.Methods.solve;

public class arrays_questions {
    static void main(String[] args) {


//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        int sum = 0;
//        int mean = 1;
//
//
//        for (int i = 0; i <=n-1; i++) {
//            sum += arr[i];
//            mean = sum/size;
//
//        }
//        System.out.println(sum);
//        System.out.println(mean);
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//          int max = Integer.MIN_VALUE;
//          int max2 = 0;
//
//        for (int i = 0; i <n; i++) {
//          arr[i] = sc.nextInt();
//
//            if(arr[i] > max){
//                max2 = max;
//                max = arr[i];
//
//            }else if(arr[i] > max2){
//                arr[i] = max2;
//            }
//
//
//
//        }
//        System.out.println("Second greatest element = " + max2);


//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//        String issorted = "YES";
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//            }
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i+1] < arr[i]){
//                issorted = "NO";
//            }
//
//        }
//        System.out.println(issorted);


//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//        int start = 0;
//        int end = n-1;
//
//
//        for (int i = 0; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; start < end; i++) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//
//        }
//        for (int i = 0; i < n ; i++) {
//            System.out.print(arr[i] + " ");
//        }


//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//          int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int temp = arr[0];
//        for (int i = 0; i < n-1; i++) {
//            arr[i] = arr[i+1];
//
//        }
//               arr[n-1] = temp;
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//        int k = sc.nextInt();
//
//
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int j = 0; j < k ; j++) {
//
//            int temp = arr[0];
//            for (int i = 0; i < n - 1; i++) {
//                arr[i] = arr[i + 1];
//
//            }
//            arr[n - 1] = temp;
//        }
//
//        for (int i = 0; i <n ; i++) {
//            System.out.println(arr[i] + " ");
//        }


//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int k = sc.nextInt();
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int r = 0; r < k; r++) {
//
//
//        int temp = arr[n-1];
//        for (int i = n-1; i > 0; i--) {
//            arr[i] = arr[i-1];
//        }
//            arr[0] = temp;
//        }
//
//            System.out.print(Arrays.toString(arr));

//        Scanner sc = new Scanner(System.in);
//
//        int arr[] = {1,2,3,4,5};
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum = 0;
//            for (int j = i; j < n; j++) {
//
//                sum += arr[j];
//                if(sum>max){
//                    max=sum;
//                }
//
//            }
//
//        }System.out.println(max);


//        int arr[] = {1,2,3,4,5};
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if(sum>max){
//                    max = sum;
//                }
//
//            }
//        } System.out.println(max);


//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//        int index = 0;
//
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i] != 0){
//                int temp = arr[index];
//                arr[index] = arr[i];
//                arr[i] = temp;
//                index++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }


//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

//        for (int i = 0; start < end; i++) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int i = 0; i < n; i++) {
//            sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//
//                if(sum>max){
//                    max = sum;
//                }
//            }
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//      int arr[] = {1,2,3,4,5};
//      int n = arr.length;
//      int start = 0;
//      int end = n-1;
//
//        for (int i = 0; start<end; i++) {
//            for (int j = 0; j < n; j++) {
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//                if(start>end){
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//Scanner sc = new Scanner(System.in);
//
//
//
//           int size = sc.nextInt();
//           int arr[] = new int[size];
//           int arr2[] = new int[size*2];
//
//           int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n ; i++) {
//            arr2[i] = arr[i];
//        }
//        for (int i = 0; i <n ; i++) {
//            arr2[i+n] = arr[i];
//        }
//
//
//        System.out.println(Arrays.toString(arr2));









































































































    }
}

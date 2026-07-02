package arrays_and_methods;

import com.sun.tools.javac.Main;

public class Methods {
    public void print(){
        System.out.println("yokoso");
    }
    public static int solve(){
        int a = 10, b = 20;
        int sum = a+b;
        return sum;


    }
    public static void main(String[] args) {

        System.out.println(solve());
          Methods obj  = new Methods();
          obj.print();
          // static = ko by name call kr pate ho.
        // non static = object create krna pdta h fir call krna pdta h name ke piche object.lgake


    }
}

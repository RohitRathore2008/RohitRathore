package String;

import java.util.Arrays;

public class String_methods {
    static void main(String[] args) {



        String s = "One Piece Is Real";

        System.out.println(s.length());
        System.out.println(s.toLowerCase());

        String arr[] = s.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println(s.substring(1,6));








    }
}

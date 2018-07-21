import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            if(n > i) 
                arr[size - n + i] = in.nextInt();
            else
                arr[i - n] = in.nextInt();
        }
        
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}

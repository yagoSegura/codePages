import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(sumEvenFibo(n));
        }
    }
    
    public static long sumEvenFibo(long n){
        long f1 = 2;
        long f2 = 0;
        long f = 0;
        long sum = 0;
        
        while(f1 < n){
            sum += f1;
            f = 4 * f1 + f2;
            f2 = f1;
            f1 = f;
        }
        
        return sum;
    }
}

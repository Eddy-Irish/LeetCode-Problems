//Useful Method for finding the Greatest Common Denominator of two values

public class findGcdMethod {

    public static void main(String[] args){
        
        int k = 10;
        int length = 7;
        int gcd = 3 % 7;
        int test = 7;
        int test2 = 5;
        test2 ^= test;

        //int gcd = findGcd(length, k);
        System.out.print(test2);
    
    }

    public static int findGcd(int a, int b){
        return (a == 0 || b == 0) ? a + b : findGcd(b, a % b);
    }
    
}
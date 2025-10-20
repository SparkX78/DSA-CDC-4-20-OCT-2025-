public class DSA_22 {
    
    public static int reverseExponentiation(int n) {
        int rev = reverse(n);
        long result = power(n, rev);
        return (int)result;
    }
    private static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * num + num % 10;
            num = num/10;
        }
        return rev;
    }
    private static long power(int Base, int Expo){
        if(Expo == 0){
            return 1;
        }
        return Base * power(Base, Expo - 1);
    }
    public static void main(String args[]){
        int num = 20;
        System.out.println(reverseExponentiation(num));
    }
}



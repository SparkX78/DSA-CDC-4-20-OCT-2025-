public class DSA_23 {
    
    static int evenlyDivides(int n) {
        int original = n;
        // code here
        int count = 0;
        while(n > 0){
            int dig = n % 10;
            if(dig >0){
                if(original % dig == 0){
                    count++;
                }
            }
            n = n/10;
                
            
            
        }
        return count;
    }
    public static void main(String args[]){
        int n = 246;
        System.out.println(evenlyDivides(n));
    }
}


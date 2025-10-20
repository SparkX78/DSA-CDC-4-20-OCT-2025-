public class DSA_21 {
    public static int recurFact(int num){
        if(num == 0){
            return 1;
        }
        return num* recurFact(num-1);
    }
    public static void main(String args[]){
        int num = 5;
        System.out.println(recurFact(num));
    }
}

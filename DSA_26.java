import java.util.*;
public class DSA_26 {
    public static List<Integer> removeDup(int[] nums){
        List<Integer> result = new ArrayList();
        HashSet<Integer> seen = new HashSet<>();
        helper(nums, 0, result, seen);
        return result;
    }
    private static void helper(int[] arr, int index, List<Integer> result, HashSet<Integer> seen){
        if(index >= arr.length){
            return;
        }
        if(!seen.contains(arr[index])){
            seen.add(arr[index]);
            result.add(arr[index]);
        }
        helper(arr, index+1, result, seen);
    }
    public static void main(String args[]){
        int[] arr = {20,33,12,63,33,98,78,12};
        List<Integer> unique = removeDup(arr);
        System.out.println(unique);

    }

}

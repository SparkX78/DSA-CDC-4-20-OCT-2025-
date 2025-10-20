public class DSA_27 {
    public static void TowerOfHanoi(int n, char source, char auxillary, char destination){
        if(n == 1){
            System.out.println("Move 1 disk from "+ source + " towards the "+ destination);
            return; 
        }
        TowerOfHanoi(n-1, source, destination, auxillary);
        System.out.println("Move the "+ n+ " disks from "+ source +" towards the "+ destination);
        TowerOfHanoi(n-1, auxillary, source, destination);
    }
    public static void main(String args[]){
        int disks = 3;
        TowerOfHanoi(disks, 'A', 'B', 'C');
    }
}

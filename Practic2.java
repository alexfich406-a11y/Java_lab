public class Practic2 {
	  public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};
        String s = Arrays.toString(arr);
        
        Arrays.sort(arr);
        
        int index = Arrays.binarySearch(arr, 5);
        
        int[] arr2 = {1, 2, 5, 8, 9};
        boolean eq = Arrays.equals(arr, arr2);
        
        int cmp = Arrays.compare(arr, arr2);
    }
}

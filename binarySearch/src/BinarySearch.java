import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
    int [] arr = {9,8,6,7,4,5,3,1,2,0};
        for (int i :
                arr) {
            Arrays.sort(arr);
        }
        int findNum = 5;
        System.out.println(findNumMethod(arr,findNum));
    }

    private static int findNumMethod(int[] arr, int findNum) {
        int min = 0;
        int max = arr.length;
        int mid ;
        while(min<max){
            mid = (min+max)/2;
            if(findNum< arr[mid]){
                max = mid;
            }
            else if(findNum> arr[mid]){
                min = mid;
            }
            else if(findNum==arr[mid]) return mid;
        }
        return -1;
    }
}

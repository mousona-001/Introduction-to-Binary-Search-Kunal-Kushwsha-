import java.util.*;
public class BinarySearch {
    /*
   when array is in descending order :
    target > num[mid] --> end = mid - 1
    target < num[mid] --> start = mid + 1
    when array is in ascending order :
    target < num[mid] --> end = mid - 1
    target > num[mid] --> start = mid + 1
    */
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,14};
        int target = 9;
        int ans = binsearch(arr,target);
        System.out.println(ans);
    }

    static int binsearch(int[] num, int target){
        int start = 0;
        int end = num.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < num[mid]) {
                end = mid - 1;
            }
            else if(target > num[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,17};
        int target = 1;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] num, int target){
        int start = 0;
        int end = num.length - 1;

        boolean isAsc = num[start] < num[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == num[mid])
                return mid;
            if (isAsc){
                if(target > num[mid]) {
                    start = mid + 1;
                }
                else if(target < num[mid]){
                    end = mid - 1;
                }
            }
            else{
                if(target < num[mid]) {
                    start = mid + 1;
                }
                else if(target > num[mid]){
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}

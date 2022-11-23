public class Binary_Search {
    static int search(int[] num, int target) {
        int start = 0;
        int end   = num.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(num[mid] == target)
                return mid;
            else if(num[mid]> target)
                end = mid-1;
            else
                start = mid +1;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,6,8,9,12,25};
        int target = 12;
        System.out.println(target+" Found at Index: "+search(arr, target));
    }
}
import java.util.Scanner;
class sqrt{
    public static int isSqrt(int nums){
        int i=1;
        int sqrt = i*i;
        while(nums>sqrt){
            i++;
            sqrt = i*i;
        }
        return i-1;
    }
    public static void main(String[] args){
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isSqrt(num));
    }
}
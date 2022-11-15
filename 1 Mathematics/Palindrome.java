class Palindrome{
    static boolean palindrome(int x){
        int temp=x;
        int rev=0;
        while(x!=0){
			int rem = x%10;
            rev=rev*10+rem;
            x=x/10;
        }
		return rev==temp;
    }
    public static void main(String[] args){
        palindrome(121);
		System.out.println(palindrome(121));
    }
}




// class Solution {
//     public boolean isPalindrome(int x) {
//         int original = x;
//         int rev = 0;
//         while(x>0){
//             rev = x%10 + rev*10;
//             x= x/10;
//         }
//         return rev==original ? true : false;
//     }
// }
class Palindrome_str{
    static boolean isPalindrome(String str, int start, int end){
        while(start!=end){
            if(str.charAt(start) ==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        isPalindrome("ABBA", 0, 3);
    }
}
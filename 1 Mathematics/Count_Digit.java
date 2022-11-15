class GFG {
	static int countDigits(int x){
	        if(x==0){
                        return 0;
                }
                return 1+countDigits(x/10);
	}
	public static void main (String[] args) {
        int digit = countDigits(1234543);
        System.out.println(digit);
	}
}
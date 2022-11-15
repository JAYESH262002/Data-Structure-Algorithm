class Prime{
    static boolean isPrime(int x){
        for(int i =2; i<Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(10));
    }
}
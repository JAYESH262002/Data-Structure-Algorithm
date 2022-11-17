package Recursion;
public class Prime_Range {
    static void isPrime(int x, int y){
        int i=x;
        while(i!=y+1){
            boolean isPrime = true;
            if(i==0 || i==1){
                System.out.println(i+" Composite num");
                ++i;
                continue;
            }
            for(int a=2; a<=Math.sqrt(i);a++){
                if(i%a==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == false)
                System.out.println(i+" Composite num");
            else
                System.out.println(i+" Prime num");
            i++;
        }
    }
    public static void main(String[] args){
        isPrime(1,21);
    }   
}
public class Trailing_Zero {
    static int fact(int x){
        if(x==0){
            return 1;
        }
        return x*fact(x-1);
    }
    static int zero(int x){
        int temp=0;
        while(x%10==0){
            x/=10;
            temp++;
        }
        return temp;
    }
    public static void main(String[] args){
        int fact2 = fact(5000);
        System.out.println(zero(fact2));
    }
}
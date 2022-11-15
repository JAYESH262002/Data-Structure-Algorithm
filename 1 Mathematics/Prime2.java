public class Prime2 {
    static boolean isPrime2(int x){
        if(x==2 || x==3){
            return true;
        }
        if(x%2==0 && x%3==0){
            return false;
        }
        for(int i=5; i<Math.sqrt(x); i+=6){
            if(x%i == 0 || x%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        isPrime2(11);
    }
}

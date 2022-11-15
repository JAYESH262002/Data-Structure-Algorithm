public class GCD2 {
    static int GCD2(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return GCD2(b, a%b);
        }
    }
    public static void main(String[] args){
        System.out.println(GCD2(246, 2448));
    }
}
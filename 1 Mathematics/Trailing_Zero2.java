public class Trailing_Zero2 {
    static int Zero(int x){
        int temp=0;
        for(int i=5; i<=x; i*=5){
            temp=temp+(x/i);
        }
        return temp;
    }
    public static void main(String[] args){
        System.out.println(Zero(11));
    }
}
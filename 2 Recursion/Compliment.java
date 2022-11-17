public class Compliment {
    static int[] isComp(int x){
        int arr[] = new int[32];
        for(int i=0; i<32; i++){
            if((x & 1) ==1){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
            x=x>>1;
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println(isComp(7));
    }
}
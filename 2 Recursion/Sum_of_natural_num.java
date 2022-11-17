package Recursion;

public class Sum_of_natural_num {
    static int sum(int x){
        if(x==0){
            return 0;
        }
        return x+sum(x-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    
}

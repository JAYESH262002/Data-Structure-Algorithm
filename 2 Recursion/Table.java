package Recursion;
public class Table {
    static void  table(int x, int y){
        if(y>10){
            return;
        }
        System.out.println(x*y);
        table(x, y+1);
        
    }
    public static void main(String[] args){
        table(13, 1);
    }
}

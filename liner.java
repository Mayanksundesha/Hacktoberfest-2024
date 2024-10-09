//liner java
import java.util.*;
public class Linerrr{
     public static int liner(int marks[] , int keys){
        for(int i = 0; i<marks.length ; i++){
            if(i==keys){
                return marks[i];
            }
            }
            return -1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] ={10, 20 , 30 , 40, 50};
        int keys = sc.nextInt();
        int index = liner(marks , keys);
        if(index == -1){
            System.out.println("Not found");
        }
    else {
        System.out.println("Keys index is " + index);
    }
    
    }
}

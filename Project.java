import java.util.*;
public class Project{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
    
        int numbers[] = new int[5];

        //input
        System.out.println("Enter the input numbers:");
        for(int i=0; i<5; i++){
            numbers[i]=sc.nextInt();
        }
        
        int sum = numbers[0] ;
        
        //output
        for(int i=0; i<5; i++){
            sum= sum+ numbers[i];
        }
        System.out.println(sum);
    }
} 
    


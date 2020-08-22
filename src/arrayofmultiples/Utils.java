package arrayofmultiples;
import java.util.Scanner;

public class Utils {
    public static int[] readNumLen(){
        int numLen[] = {0,0};
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number:");
        numLen[0] = scan.nextInt();
        System.out.print("Enter length:");
        numLen[1] = scan.nextInt();
        
        return numLen;
    }
    
    
    public static int[] createMultiples(int[] numLen){
        int[] arrayOfMultiples = new int[numLen[1]];
        
        for(int i = 0; i < numLen[1]; i++){
            arrayOfMultiples[i] = numLen[0] * (i+1);
        }
        
        return arrayOfMultiples;
    }
    
    public static void showArray(int[] arrayOfMultiples){
        for(int i = 0; i < arrayOfMultiples.length; i++){
            System.out.println("Number "+i+": "+arrayOfMultiples[i]+".");
        }
    }
}

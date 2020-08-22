/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofmultiples;

/**
 *
 * @author Pau
 */
public class ArrayOfMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        int numLen[] = {0,0};
        
        
        numLen = Utils.readNumLen();
        //System.out.println("Numbr: "+numLen[0]+". Length: "+numLen[1]+".");
        
        int[] arrayOfMultiples = new int[numLen[1]];
        arrayOfMultiples = Utils.createMultiples(numLen);
        
        Utils.showArray(arrayOfMultiples);
        
    }
    
}

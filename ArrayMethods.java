import java.util.Arrays;

/**
* Class that contains methods for an Array
*
* @author Andrew Lam, alam001@student.sdccd.edu
* @version v1.1
* @since 10/21/2026
* 
*/

public class ArrayMethods
{
    // instance variables - replace the example below with your own
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    
    /**
     * Counts from each element in myArray starting from 0
     * 
     * @return The number of values that are in the array
     */
    public int count()
    {
        int count = 0;
        for (int i : myArray){
            count++;
        }
        return count;
    }
    
    /**
     * Adds up each element in myArray to sum
     * 
     * @return The sum of the values in the array
     */
    public int sum()
    {
        int sum = 0;
        for (int i : myArray){
            sum += i;
        }
        return sum;
    }
    
    /**
     * Divides the sum of the array and the count
     * of the array to get the average.
     * 
     * @return The average of the array
     */
    public double average()
    {
        return ((double) sum())/count();
    }
    
    /**
     * Finds the biggest integer in the array.
     *
     * @return The max of the array
     */
    public int findMax()
    {
        int max = myArray[0];
        for (int i : myArray){
            
            if (max < i){
                max = i;
            }
            
        }
        return max;
    }
    
    /**
     * Find the index of the biggest integer in the array
     * 
     * @return The index of the max in the array
     */
    public int findIndexOfMax()
    {
        int maxIndex = 0;
        int max = findMax();
        
        for (int i = 0; i < myArray.length - 1; i++){
            
            if (myArray[i] == max){
                maxIndex = i;
                return maxIndex;
            }
        }
        return maxIndex;
    }
    
    /**
     * Finds the last index that contains the inputed key
     * 
     * @return The last index where key is found
     */
    public int findLast(int key)
    {
        int indexKey = -1;
        
        for (int i = myArray.length - 1; i >= 0; i--){
            
            if (myArray[i] == key){
                indexKey = i;
                return indexKey;
            }
        }
        return indexKey;
    }
    
    /**
     * Creates a new array and finds all of the indexes where the value of key is found
     * and then adds those values into that array
     * 
     * @return An array containing the index(es) of every occurrence of key.
     */
    public int[] findAll(int key)
    {
        int indexCount = 0; 
        
        for(int i: myArray){
            if (i == key){
                indexCount++;
            }
        }
        
        int[] indexArray = new int[indexCount]; 
        //Creates a new array with the correct length
        
        indexCount = 0; 
        //Reuse indexCount to put the index of myArray into indexArray's 
        //correct index
        for (int i = 0; i < myArray.length - 1; i++){
            
            if (myArray[i] == key){
                
                indexArray[indexCount] = i;
                indexCount += 1;
            }
        }
        
        return indexArray;
    }
    
    /**
     * Gets the integer array myArray
     * 
     * @return myArray
     */
    public int[] getArray()
    {
        
        return myArray;
        
    }
    
    /**
     * Creates a copy of myArray and puts it
     * 
     * @return A copy of myArray
     */
    public int[] copyArray()
    {
        
        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
        return copyArray;
        
    }
    
    /**
     * Reverses the order of all of the values of the inputed array, inArray.
     * 
     * @return An array with the reverse order of inArray
     */
    public int[] reverseArray(int[] inArray)
    {
        
        int countIndex = 0;
        int[] reverseArray = new int[inArray.length];
        
        
        for (int i = myArray.length - 1; i >= 0; i--){
            reverseArray[countIndex] = inArray[i];
            countIndex++;
        }
        
        return reverseArray;
        
    }
    
    /**
    *prints an int array, nicely formatted
    *
    *@param inArray int array to print
    */
    public void print(int[ ] inArray){
    
    System.out.print("{");
    int i;
    // print elements before the last, separated by commas
    for (i = 0; i < inArray.length - 1; i++){
    System.out.print(inArray[i] + ", ");
    }
    // print last element. Careful here to handle length 0
    if (inArray.length > 0) {
    System.out.print(inArray[i]);
    System.out.println("}");
    }
    }
}
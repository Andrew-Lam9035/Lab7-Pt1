import java.util.Arrays;

/**
* Class that contains methods for an Array
*
* @author Andrew Lam, alam001@student.sdccd.edu
* @version v1.0
* @since 10/18/2026
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
        
        for (int i = 0; i < myArray.length; i++){
            
            if (myArray[i] == max){
                maxIndex = i;
                return maxIndex;
            }
        }
        return maxIndex;
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
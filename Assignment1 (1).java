
/**
 * Assignment 1
 *
 * @author Areeb Haq
 * @version January 31 2020
 */
public class Assignment1
{

    public int c(int n,int k) // method used to spock problem
    {
        if(k == 0){ // base case for spock problem
            return 1;
        }

        if(k == n){ // base case for spock problem
            return 1;
        }

        if(k > n){  // base case for spock problem
            return 0;
        }

        return (c(n-1, k-1) + c(n-1, k)); // recrusion .. goes back until base cases are fulfilled
    }

    public static int P(int n) // solution for Parade problem
    {
        if(n == 1) {    // base case for spock problem
            return 2;
        }

        if(n == 2) {    // base case for spock problem
            return 3;
        }

        if(n<=0) {  // base case for spock problem
            throw new IllegalArgumentException();
        }

        return P(n-1) + P(n-2);// recrusion .. goes back until base cases are fulfilled
    }

    public static void writeLine(char ch, int n)
    {
        if(n < 1)  // base case for spock problem
        {
            return;
        }

        else if(n>= 1)
        {
            System.out.print(ch);
            writeLine(ch, n-1);

        }

    }

    public static void writeBlock(char ch, int n, int m)
    {

        if(m < 1)   // base case for spock problem
        {
            return;
        }

        if(m > 0)   // base case for spock problem
        {

            writeLine(ch,n);
            System.out.println();
            writeBlock(ch, n, m-1);
        }
    }


    public static void reverseDigits(int number)
    {
        if(number<10)// base case for spock problem
        {
            System.out.print(number);
        }

        else if (number < 0)
        {
            throw new IllegalArgumentException(); // we cant have number less than 0 because we are only looking for positive cases
        }
        else 
        { 
            int rev = number%10;
            System.out.print(rev);
            reverseDigits(number/10);
        }

    }

    public static int myBinarySearch(String []anArray, int first,int last, String value){
        if(first > last)// base case for spock problem
        {
            return 0;
        }

        int middle = ((first + last)/2); // finding the middle of the array
        int comp = value.compareToIgnoreCase(anArray[middle]); // store the value returned by the compareTo method into comp to use later

        if(comp == 0){ // this would mean the value is in the middle
            return middle;
        }
        else if(comp < 0) // value is left
            return myBinarySearch(anArray, first, middle-1, value);

        else // value is right
            return myBinarySearch(anArray, middle+1, last, value);
    }  

        
}

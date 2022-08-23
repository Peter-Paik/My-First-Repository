
/**
 * Peter Paik
 * 8/23/22
 * Chapter 1 Notes
 * Noes from class
 * Who helped me:
 */
import java.util.Scanner; //class is the last argument ("Scanner")
import java.util.Random;
public class ch1Notes
{
    /**
     * this is code notes for chapter 1
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // basic data types
        int x = 9,y,z;
        boolean choice = false;
        char letter = 'b'; //For char, use single quotation marks
        float number2 = 9; //is only 4 bytes or something, where double is 8
        double number1 = 8.0, number3, number4;//use double more often
        short num = 6; //short and long are integers
        long numbbbbber = 9999;
        
        //These are objects
        //Class   ID       memory   constructor
        String   word    =  new      String("Hello World");
        Integer  number  =  new      Integer(47);
        Double   anumber =  new      Double(45.8);
        
        System.out.print(word);
    }
}

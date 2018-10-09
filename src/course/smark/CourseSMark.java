/*
Mouner Dabjan   
Oct 5 2018 
To show the course's mark of the users input
 */

package course.smark;
import java.util.Scanner; 

/**
 *
 * @author modab5310
 */
public class CourseSMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in); 
        
        double mark; 
        
        System.out.println("Please Enter your course mark:");
        mark = keyedInput.nextDouble(); 
        
        // if- statements
        
        if (mark>=80)
        {
            System.out.println("You recieved an A."); 
        }
        
        else if (mark>=70)
        {
            System.out.println("You recieved a B."); 
        }
        
        else if (mark>=60)
        {
            System.out.println("You recieved a C."); 
        }
        
        else if (mark>=50)
        {
            System.out.println("You recieved a D.");
        }
        
        else
        {
            System.out.println("Sorry you failed."); 
        }
        
 
    }
    
}

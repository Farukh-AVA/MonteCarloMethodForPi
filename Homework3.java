/**
 * @author Farukh Khassan Khojayev.
 * @since 10-16-2019
 * @vesion 1.0
 * 
 * This program implement the Monte Carlo Method for the Estimation of Pi.
 * By the example of the circular dart board with the radius of 1 foot, and 
 * and the dartboard is attached in the square with side of 2 feet. Next,
 * we throwing big number of darts to the square, to count how many darts in 
 * the square and how many in dartboard we inserting the pairs of random 
 * numbers with range of [-1 and 1] by using Java.util.Random class. We can 
 * determine whether pairs of darts in the dartboard by using the formula 
 * of (x^2+Y^2) less then 1, and if this true we count darts by using counter,
 * inside the for loop for darts. Last  we using the formula to calculate Pi
 *            4*number of darts 
 * Pi=  -----------------------------
 *        number that hit the dartboard.  
 * As number of darts approach infinity the Pi become more precise.
 * 
 * Next, we timed the execution time to create a table number of darts vs time.
 * 
 *  
 * 
 */ 
package homework3;
import java.util.Scanner;//import Scanner class.
import java.util.Random;//import Random class.


public class Homework3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double in_circle_count = 0,  pi_estimate;
        int i,darts;
        System.out.println("Eanter the number of Darts");
        darts=sc.nextInt();
        long startTime = System.currentTimeMillis(); //Start of timeng   
          for(i=0; i <darts; i++){
              double x = rand.nextDouble()*Math.pow(-1, rand.nextInt());
              //formula to calculate range for random numbers[-1 and 1]
              double y = rand.nextDouble()*Math.pow(-1, rand.nextInt());
              //formula to calculate range for random numbers[-1 and 1]
                 if((Math.pow(x,2)+ Math.pow(y,2))<=1) { 
                 //numbers in the dartboard     
                 in_circle_count++;
                 // counting the number in the dartboard.
                    
                 }       
           }
           long endTime= System.currentTimeMillis();//end of timing
           pi_estimate= (4.0*in_circle_count)/darts;// formula for estimation
           System.out.printf("Pi Estimate: %.5f%n",pi_estimate);
           System.out.println("Total execution time: "+(endTime-startTime)/1000);
       
        }
        
        
        
   }

    

